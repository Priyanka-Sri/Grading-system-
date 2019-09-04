package com.revature.grading.dao;

public enum SubjectEnum {

	ENGLISH(1,"ENG"),MATHS(2,"MAT"),COMPUTER(3,"COM"),SCIENCE(4,"SCIENCE"),SOCIAL(5,"SOCIAL");
	
	public int choice;
	
	public String columnName;
	
	private SubjectEnum(int choice, String columnName) {
		this.choice = choice;
		this.columnName = columnName;
	}
	
	public static SubjectEnum getColumnName(int choice) {
		
		SubjectEnum search = null;
		for( SubjectEnum s:values()) {
			if (s.choice == choice) {
				search = s;
				break;
			}
		}
		return search;
	}
}
