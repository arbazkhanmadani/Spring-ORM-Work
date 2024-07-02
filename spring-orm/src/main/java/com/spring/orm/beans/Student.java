package com.spring.orm.beans;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity
@Table(name="Student") 
public class Student {
	
	private int rollNo;
	private String sName;
	private String college;
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", sName=" + sName + ", college=" + college + "]";
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public Student(int rollNo, String sName, String college) {
		super();
		this.rollNo = rollNo;
		this.sName = sName;
		this.college = college;
	}
	
}
