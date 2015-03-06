package com.json.spring3hibernate4.dao.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.json.s3h4.model.entity.User;
import com.json.s3h4.persist.dao.UserDAO;

public class TestUserDAO {

	public static BeanFactory factory = new ClassPathXmlApplicationContext("classpath*:/applicationContext.xml");
	
	@Resource(name="userDAO")
	private UserDAO userDAO;
	
	@Test
	public void testGet(){
        User user = userDAO.find(1l);
        System.out.println(user);
		
	}
}
