package com.springcore;

public class Student {
	
	private int sid;
	private String sname;
	private String saddr;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		System.out.println("setting student id");
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		System.out.println("setting student name");
		this.sname = sname;
	}
	public String getSaddr() {
		return saddr;
	}
	public void setSaddr(String saddr) {
		System.out.println("setting student Address");
		this.saddr = saddr;
	}
	public Student(int sid, String sname, String saddr) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.saddr = saddr;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddr=" + saddr + "]";
	}

	
	
}
