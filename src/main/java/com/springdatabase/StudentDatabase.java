package com.springdatabase;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class StudentDatabase {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	int rollno;
	@Column(name="name")
	String name;
	@Column(name="dept")
	String dept;
	@Column(name="regno")
	int regno;
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	
	public StudentDatabase() {
		super();
	}
	public StudentDatabase( String name, String dept, int regno) {
	
		
		this.name = name;
		this.dept = dept;
		this.regno = regno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
}
