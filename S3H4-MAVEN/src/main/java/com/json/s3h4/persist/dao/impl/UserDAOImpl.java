package com.json.s3h4.persist.dao.impl;

import org.springframework.stereotype.Repository;

import com.json.s3h4.model.entity.User;
import com.json.s3h4.persist.dao.UserDAO;

/**
 * 用户dao层实现
 * @author 付强
 * 2014年7月9日 下午10:35:27
 */
@Repository("userDAO")
public class UserDAOImpl extends BaseDAOImpl<User,Long> implements UserDAO{

	public UserDAOImpl() {
		super(User.class);
	}

	private static final long serialVersionUID = -2796344492915742940L;
}
