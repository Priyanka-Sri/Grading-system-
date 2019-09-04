package com.revature.grading.dao;

import java.sql.SQLException;

import com.revature.grading.model.Admindetailes;

public interface InterUserDao {

	Admindetailes login(String sname, int regno) throws SQLException;

	void findBySubject(int menu) throws SQLException;

	
}