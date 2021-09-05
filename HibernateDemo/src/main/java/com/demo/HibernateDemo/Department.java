package com.demo.HibernateDemo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Department {
	
	@Id
	private int deptId;
	
	private String deptName;
	
	@ManyToMany(mappedBy = "dept")
	private List<Student>  student= new ArrayList<Student>();
	
	
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = (List<Student>) student;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String string) {
		this.deptName = string;
	}
	

}
