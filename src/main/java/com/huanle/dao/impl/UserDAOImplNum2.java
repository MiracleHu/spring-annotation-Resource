package com.huanle.dao.impl;

import com.huanle.dao.UserDAO;
import com.huanle.model.User;

public class UserDAOImplNum2 implements UserDAO {
	
	private int daoId;
	
	public int getDaoId() {
		return daoId;
	}

	public void setDaoId(int daoId) {
		this.daoId = daoId;
	}

	public void save(User user) {
		//Hibernate
		//JDBC
		//XML
		//NetWork
		System.out.println("user was saved by daoId "+ daoId);
	}
	
	@Override
	public String toString() {
		return "implementNum2 daoId=" + daoId;
	}

}
