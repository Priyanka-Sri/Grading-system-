package com.revature.grading.services;

import java.util.Scanner;

import com.revature.grading.dao.InterUserDao;
import com.revature.grading.dao.UserDao;
import com.revature.grading.model.Admindetailes;

public class Admin_Page {
	static Scanner scn = new Scanner(System.in);
	public static void main(String args[]) throws Exception {

		Admin_Page.WelcomePage();

	}

	public static void WelcomePage() throws Exception, ClassNotFoundException

	{
		System.out.println("\033[0;1m");//out put will come in blod font use this command
		//System.out.println("\033[0;4m");//FOR OUTPUT UNDER LINE USING THIS COMMAND
		System.out.println("                                       @@@@@@ ADMIN PAGE @@@@@");
		
		
		System.out.println("********************************");
		System.out.println("1.ADMIN LOGIN  OR   2.USER LOGIN");
		System.out.println("********************************");
		

		boolean quit = false;
		do {
			System.out.println("ENTER THE OPTION:");
			int menu = scn.nextInt();

			switch (menu)

			{
			case 1:

			{
				
				System.out.println("ENTER THE ADMIN ID: ");
				String uname = scn.next();
				System.out.println("ENTER THE PASSWORD:\033[0;1m  ");
				String pass = scn.next();

				if (uname.equals("12345") && pass.equals("admin"))

				{

					System.out.println("=============================");
					System.out.println("ENTER THE STUDENT INFORMATION");
					System.out.println("=============================");

					System.out.println("Enter Student name:");
					String sname = scn.next();

					System.out.println("Enter The Mark Of English:");
					int eng = scn.nextInt();

					System.out.println("Enter The Mark Of Mathematics:");
					int mat = scn.nextInt();

					System.out.println("Enter The Mark Of Computer:");
					int com = scn.nextInt();

					System.out.println("Enter The Mark Of Science:");
					int science = scn.nextInt();

					System.out.println("Enter The Mark Of Social:");
					int social = scn.nextInt();

					int total = eng + mat + com + science + social;
					double avg = (double) (total / 5);

					System.out.println("Total Marks:" + total);
					System.out.println("Average:" + avg);
					String grade;
					{
						if (total > 470 && total <= 500) {
							grade = "D";

						} else if (total > 430 && total <= 470) {
							grade = "A";

						} else if (total > 390 && total <= 430) {
							grade = "B";

						} else {
							grade = "F";
						}

						System.out.println("GRADE:" + grade);

						Register.register(sname, eng, mat, com, science, social, total, avg, grade);

					}
				} else {

					System.out.println("INVALID ADMIN ID AND ADMIN PASSWORD ");

				}
				break;

			}
			case 2:

			{
				

				System.out.println("##################");
				System.out.println("STUDENT LOGIN...!!");
				System.out.println("##################");

				System.out.println("STUDENT NAME: ");
				String Sname = scn.next();

				System.out.println("ENTER THE STUDENT REGNO: ");
				int regno = scn.nextInt();

				Admindetailes det = new Admindetailes();
				

				InterUserDao obj = new UserDao();
				det = obj.login(Sname, regno);

				if (det != null) {
					
					System.out.println();
					System.out.println("LOGIN SUCCESSFULLY");

					UserOperations.function();

				} else
					
					
					System.out.println();
					System.out.println("'INVALID STUDENT NAME AND REGNO'");
					
					System.out.println();

				break;

			}

			
			
			case 3:

				quit = true;

				break;

			}
		} while (!quit);

	}

}
