package com.springdatabase.ui;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="password")
public class LoginEntity {
	public LoginEntity(String mail, String password) {
		this.mail = mail;
		this.password = password;
	}
	public LoginEntity() {
		super();
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name="mailid")
	String mail;
	@Column(name="password")
	String password;

}
