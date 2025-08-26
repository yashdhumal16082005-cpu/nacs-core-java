package com.nacs.oops.encapsulation;

public class Student {
	public int rollNo;
	public String name;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		if(rollNo>0)
		this.rollNo = rollNo;
		else rollNo=0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
