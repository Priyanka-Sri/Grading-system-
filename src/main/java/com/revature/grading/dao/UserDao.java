package com.revature.grading.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.grading.model.Admindetailes;
import com.revature.grading.util.ConnectionUtil;



public class UserDao implements InterUserDao {
	
	



		public Admindetailes login(String Sname,int regno) throws SQLException {
			// TODO Auto-generated method stub
			Connection con=ConnectionUtil.getConnection();
			String sql="select SName,REGNO,ENG,MAT,COM,SCIENCE,SOCIAL,TOTAL,AVG,GRADE from  StudentDb where SName=? && REGNO=?" ;
	        PreparedStatement pst = con.prepareStatement(sql);
	        
	        
	        pst.setString(1, Sname);
	        pst.setInt(2,regno);
	        			ResultSet rs = pst.executeQuery();
	        			
	        			
	        		Admindetailes det=null;
	        		
	        		  if(rs.next())    
	        				  {
	      
	        	String sname= rs.getString("SName");
	    		Integer regno1= rs.getInt("REGNO");
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
	    		det.setRegNo(regno1);
	    		det.setENG(eng);
	    		det.setMAT(mat);
	    		det.setCOM(com);
	    		det.setScience(science);
	    		det.setSocial(social);
	    		det.setTotal(total);
	    		det.setAvg(avg);
	    		det.setGrade(grade);
	    		
	    		
	    		
	    		
	    		
				
				}return det;
			
		}

		public void findBySubject(int menu) throws SQLException {


			
			Connection con=ConnectionUtil.getConnection();
			
			
			
			SubjectEnum sub = SubjectEnum.getColumnName(menu);
			
			String sql1="select SName," + sub.columnName +" as subject,REGNO,GRADE from  StudentDb  order by " + sub.columnName  +"  desc" ;
			
			
			
			
			
			
    		PreparedStatement pst1 = con.prepareStatement(sql1);
    		System.out.println(" ");
    		
    		System.out.print(sub.columnName);
    		
    		
    		if(sub.columnName.equals("SCIENCE"))//FOR TABLE ALLIGNMENT ONLY IF CONDITION USED 
    			
    		{
    		System.out.print("    ");
    		}
    		else if(sub.columnName.equals("SOCIAL"))
    		{
    			System.out.print("      ");
    		}
    		else
    		{
    			System.out.print("        ");
    		}
			System.out.print("REGNO     ");
			System.out.print("GREDE     ");
			System.out.println("STUDENT NAME     ");
			System.out.println(" ");
		    ResultSet rs1 = pst1.executeQuery();
		    while(rs1.next())
		    	
		    {
		    	
		    	int subj=rs1.getInt("subject");
		    	int reg=rs1.getInt("REGNO");
		    	String grade2=rs1.getString("GRADE");
		    	String sname=rs1.getString("Sname");
				
			
			 System.out.println(subj+"           "+reg+"         "+grade2+"        "+sname);
		    }
		}
}
		
		
		
		


		



		
		
	


