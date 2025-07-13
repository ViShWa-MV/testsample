package com.springdatabase;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class StudentEntity {
	
	public StudentEntity(String name, String dept, int regno, String fathername, String mothername, String cgpa,
			String phonenumber, String address) {
		super();
		this.name = name;
		this.dept = dept;
		this.regno = regno;
		Fathername = fathername;
		this.mothername = mothername;
		this.cgpa = cgpa;
		this.phonenumber = phonenumber;
		this.address = address;
	}
	public StudentEntity(int rollno,String name, String dept, int regno, String fathername, String mothername, String cgpa,
			String phonenumber, String address) {
		super();
		this.name = name;
		this.dept = dept;
		this.regno = regno;
		Fathername = fathername;
		this.mothername = mothername;
		this.cgpa = cgpa;
		this.phonenumber = phonenumber;
		this.address = address;
		this.rollno=rollno;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	int rollno;
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
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

	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
	}

	public String getFathername() {
		return Fathername;
	}

	public void setFathername(String fathername) {
		Fathername = fathername;
	}

	public String getMothername() {
		return mothername;
	}

	public void setMothername(String mothername) {
		this.mothername = mothername;
	}

	public String getCgpa() {
		return cgpa;
	}

	public void setCgpa(String cgpa) {
		this.cgpa = cgpa;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name="name")
	String name;
	@Column(name="dept")
	String dept;
	@Column(name="regno")
	int regno;
	@Column(name="fathername")
	String Fathername;
	@Column(name="mothername")
	String mothername;
	@Column(name="cgpa")
	String cgpa;
	@Column(name="phonenumber")
	String phonenumber;
	@Column(name="address")
	String address;
	
	public StudentEntity() {
		super();
	}

}
