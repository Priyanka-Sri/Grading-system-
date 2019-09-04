package com.revature.grading.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.grading.model.Admindetailes;
import com.revature.grading.util.ConnectionUtil;

public class TOBDao implements Intertob {

	
	
	
	
	public Admindetailes login() throws SQLException {
		// TO DO Auto-generated method stub
		Connection con=ConnectionUtil.getConnection();
		String sql="select SName,REGNO,ENG,MAT,COM,SCIENCE,SOCIAL,TOTAL,AVG,GRADE  from  StudentDb " ;
        PreparedStatement pst = con.prepareStatement(sql);
        
        
        
        			ResultSet rs = pst.executeQuery();
        			
        			
        		Admindetailes det=null;
        		
        		  if(rs.next())
        				  {
      
        	String sname= rs.getString("SName");
    		Integer regno= rs.getInt("REGNO");
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
    		det.setRegNo(regno);
    		det.setENG(eng);
    		det.setMAT(mat);
    		det.setCOM(com);
    		det.setScience(science);
    		det.setSocial(social);
    		det.setTotal(total);
    		det.setAvg(avg);
    		det.setGrade(grade);
    		
    		
    		
    		System.out.println(" ");
    		System.out.print("ROLLNUMBER       ");
    		System.out.print("GRADE        ");
    		System.out.println("STUDENT NAME");
    		System.out.println(" ");
    		
    		String sql1="select SName,REGNO,ENG,MAT,COM,SCIENCE,SOCIAL,TOTAL,AVG, GRADE  from   StudentDb order by TOTAL desc " ;
    		PreparedStatement pst1 = con.prepareStatement(sql1);
		    ResultSet rs1 = pst1.executeQuery();
		    while(rs1.next())
		    {
		    	
		    	String Grade=rs1.getString("GRADE");
				String  Sname=rs1.getString("SName");
			  int  regno1=rs1.getInt("REGNO");
				
				
				
				
				System.out.println(regno1+"                  "+Grade+"             "+ Sname);
		    }
			
}
				return det;
	
	
	}
}
