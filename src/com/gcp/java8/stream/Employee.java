package com.gcp.java8.stream;

public class Employee {
	
	private int exp;
	private String tech;
	private int sal;
	
	public Employee(int exp, String tech,int sal){
		this.exp = exp;
		this.tech = tech;
		this.sal = sal;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public String getTech() {
		return tech;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}
}
