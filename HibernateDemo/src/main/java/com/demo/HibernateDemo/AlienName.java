package com.demo.HibernateDemo;

import javax.persistence.Embeddable;

@Embeddable   //doesnt create another table in fields ko table mein hi embed kr deta hai
public class AlienName {
	
	private String fname;
	private String lname;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "AlienName [fname=" + fname + ", lname=" + lname + "]";
	}
	
	

}
