package com.json.s3h4.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.json.s3h4.model.entity.User;
import com.json.s3h4.persist.dao.UserDAO;
import com.json.s3h4.service.UserService;
/**
 * 
 * @author 付强
 * 2014年7月9日 下午10:39:53
 */
@Transactional
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User,Long> implements UserService{

	private static final long serialVersionUID = -2196327037744286310L;
	
	@Resource(name="userDAO")
	private UserDAO userDAO;
	
	@Autowired
	public void setBaseDAO(UserDAO userDAO){
		super.setBaseDAO(userDAO);
		this.userDAO = userDAO;
		
	}
	
}
