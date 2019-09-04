package com.revature.grading.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.revature.grading.util.ConnectionUtil;

public class Register {
	

	static Scanner sc =new Scanner(System.in);
	public static void register(String sname,int eng,int mat,int com,int science,int social,int total,double avg,String grade ) throws SQLException, ClassNotFoundException {
		
		
		Connection con = ConnectionUtil.getConnection();	
		
		
		
		
		
		String sql = "insert into StudentDb(SName,ENG,MAT,COM,SCIENCE,SOCIAL,TOTAL,AVG,GRADE) values ( ?,?,?,?,?,?,?,?,?)";
		
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, sname);
		
		pst.setInt(2, eng);
		
		pst.setInt(3, mat);
		
		pst.setInt(4, com);
		pst.setInt(5, science);
		
		pst.setInt(6, social);
		
		pst.setInt(7, total);
	
		pst.setDouble(8, avg);
		
		pst.setString(9, grade);
	
		//pst.executeUpdate();
		//System.out.println("\nRegistered Successfully. ");
		
		 int rows = pst.executeUpdate();
         System.out.println("Number Of Rows Inserted    "+rows);
		
		

	

}
}
