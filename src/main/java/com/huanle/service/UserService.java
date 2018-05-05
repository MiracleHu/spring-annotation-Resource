package com.huanle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.huanle.dao.UserDAO;
import com.huanle.model.User;

public class UserService {
	
	private UserDAO userDAO; //面前接口的编程，接口有多个实现，由bean来配置到底哪个接口实现
	
	public void add(User user) {
		userDAO.save(user);
	}
	public UserDAO getUserDAO() {
		return userDAO; //打印这个Object的话会自动调用toString方法
	}
	
//	一般在setter方法上用@Autowired，@Qualifier指定bean的name或者id，由指定的名字装配
	@Autowired
	public void setUserDAO(@Qualifier("userDAO222") UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	

}
