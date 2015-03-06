package com.json.s3h4.web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.json.s3h4.model.entity.User;
import com.json.s3h4.service.UserService;

/**
 * 控制层：mvc中的c
 * @author 
 * 
 */

@Controller
@RequestMapping("/")
public class NewController {
	
	@Resource(name="userService")
	private UserService userService;
	
	@RequestMapping("/")
	public String info(Long id,ModelMap modelMap){
		
		
		return "user-info";
	}
	
	@RequestMapping("/save")
	public String save(Long id, @ModelAttribute("user") User user){
		if(id!=null){
			this.userService.update(user);
		}
		this.userService.save(user);
		return "redirect:/user/list.do";
	}
	
	@RequestMapping("/delete")
	public String delete(Long id){
		this.userService.delete(id);
		return "redirect:/index.jsp";
	}
	
	@RequestMapping("/list")
	public String findAll(ModelMap modelMap){
		//System.out.println(this.userService.findAll().size());
		modelMap.addAttribute("userList", this.userService.findAll());
		return "user-list";
	}
	
	@RequestMapping("/input")
	public String input(Long id, ModelMap modelMap, @ModelAttribute("user") User user){
		if(id!=null){
			modelMap.addAttribute("user", this.userService.get(id));
		}
		return "user-info";
	}
}
