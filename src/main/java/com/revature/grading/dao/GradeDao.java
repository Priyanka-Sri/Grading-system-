package com.revature.grading.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.grading.model.Admindetailes;
import com.revature.grading.util.ConnectionUtil;




public class GradeDao {


	

	public static Admindetailes login(String grade1) throws SQLException {
		// TO DO Auto-generated method stub
		Connection con=ConnectionUtil.getConnection();
		String sql="select SName,ENG,MAT,COM,SCIENCE,SOCIAL,TOTAL,AVG,GRADE from  StudentDb where GRADE=?" ;
        PreparedStatement pst = con.prepareStatement(sql);
        
        pst.setString(1, grade1);
        
        			ResultSet rs = pst.executeQuery();
        			
        			
        		Admindetailes det=null;
        		
        		  if(rs.next())
        				  {
      
        	String sname= rs.getString("SName");
    		//Integer regno= rs.getInt("RegNo");
    		Integer eng = rs.getInt("ENG");
    		Integer mat = rs.getInt("MAT");
    		Integer com = rs.getInt("COM");
    		Integer science = rs.getInt("Science");
    		Integer social = rs.getInt("Social");
    		Integer total = rs.getInt("Total");
    		Double avg = rs.getDouble("Avg");
    		String grade = rs.getString("Grade");
    		
    		det = new Admindetailes();
    		
    		det.setSname(sname);
    		//det.setRegNo(regno);
    		det.setENG(eng);
    		det.setMAT(mat);
    		det.setCOM(com);
    		det.setScience(science);
    		det.setSocial(social);
    		det.setTotal(total);
    		det.setAvg(avg);
    		det.setGrade(grade);
    		
    		System.out.println();
    		System.out.print  ("GRADE        ");
    		System.out.println("STUDENT NAME            ");
    		System.out.println("            ");
    		
    		
    		String sql1="select SName,ENG,MAT,COM,SCIENCE,SOCIAL,TOTAL,AVG,GRADE from  StudentDb where GRADE=?" ;
    		PreparedStatement pst1 = con.prepareStatement(sql1);
    		
    		
    		pst1.setString(1, grade1);
		    ResultSet rs1 = pst1.executeQuery();
		    while(rs1.next())
		    {
		    	
		    	String Studentname=rs1.getString("Sname");
				//String regno=rs1.getString("REGNO");
				
				String grade2=rs1.getString("GRADE");
			
				
				
				
				
				System.out.println( grade2+"                "+Studentname );
		    }
			
}
				return det;
	}
}


