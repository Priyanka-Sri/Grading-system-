package com.revature.grading.services;

import java.sql.SQLException;
import java.util.Scanner;
import com.revature.grading.model.Admindetailes;
import com.revature.grading.dao.GradeDao;
import com.revature.grading.dao.Intertob;
import com.revature.grading.dao.TOBDao;


public class UserOperations {
	
	static Scanner scn =new Scanner(System.in);
	static Admindetailes det=new Admindetailes();

	public static void function() throws SQLException {

			System.out.println();
		System.out.println("================");	
		System.out.println("1.TOP TO BOTTOM ");//top to bottom grade wise     grade,name,roolnumber
		
		
		System.out.println("2.GRADE WISE");//grade wise   name,roolno
	
		System.out.println("3.SUBJECT WISE");//subject wise rank older     sub,name,roolno,grade
		System.out.println("==============");
		
		boolean quit = false;
		do {
			
			System.out.println("ENTER THE CHOICE :");
		int menu=scn.nextInt();
		
		
		switch(menu)
		{
		
case 1:
		{
				//System.out.println("top to bottom");//name and reg number
	
				Intertob obj= new TOBDao();
                
                det= obj.login( );
                
                
               
				break;
		
		}
case 2:
			
			{
				//System.out.println("use enter specifi grade ");
			
			
			System.out.println("Enter the grade");
            String grade2 =scn.next();
            
            
            
            det= GradeDao.login( grade2);
            
			
			
			
			break;
			}
		
case 3:
		{
			//System.out.println("use should see sub rank:");
			
			
			SubWiseRank.function();
            
            
            
           
		
			
			
		}	
			
			
			break;
			
		
		case 4:
			
			quit = true;
			
			break;
			
		
		}
	
		} while (!quit);
	}

}
