package com.revature.grading.model;

public class Admindetailes {

	
	private String Sname;
	private int REGNO;
	private int ENG;
	private int MAT;
	private int COM;
	private int Science;
	private int Social;
	private int Total;
	private Double Avg;
	private String Grade;
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public int getRegNo() {
		return REGNO;
	}
	public void setRegNo(int regno) {
		REGNO = regno;
	}
	public int getENG() {
		return ENG;
	}
	public void setENG(int eng) {
		ENG = eng;
	}
	public int getMAT() {
		return MAT;
	}
	public void setMAT(int mat) {
		MAT = mat;
	}
	public int getCOM() {
		return COM;
	}
	public void setCOM(int com) {
		COM = com;
	}
	public int getScience() {
		return Science;
	}
	public void setScience(int science) {
		Science = science;
	}
	public int getSocial() {
		return Social;
	}
	public void setSocial(int social) {
		Social = social;
	}
	public int getTotal() {
		return Total;
	}
	public void setTotal(int total) {
		Total = total;
	}
	public Double getAvg() {
		return Avg;
	}
	public void setAvg(Double avg) {
		Avg = avg;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	@Override
	public String toString() {
		return "Admindetailes [Sname=" + Sname + ", RegNo=" + REGNO + ", ENG=" + ENG + ", MAT=" + MAT + ", COM=" + COM
				+ ", Science=" + Science + ", Social=" + Social + ", Total=" + Total + ", Avg=" + Avg + ", Grade="
				+ Grade + "]";
	}
	
	



}

