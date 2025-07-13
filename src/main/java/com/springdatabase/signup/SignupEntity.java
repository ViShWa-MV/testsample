package com.springdatabase.signup;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="signup")
public class SignupEntity {
	public SignupEntity(String firstname, String lastname, String emailid, String password, String gender) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailid = emailid;
		this.password = password;
		this.gender = gender;
	}
	public SignupEntity() {
		super();
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int rollno;
	  @Column(nullable = false)
	    private String firstname;

	    @Column(nullable = false)
	    private String lastname;

	    @Column(unique = true, nullable = false)
	    private String emailid;

	    @Column(nullable = false)
	    private String password;

	    @Column(nullable = false)
	    private String gender;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	

}
