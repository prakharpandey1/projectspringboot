package com.project;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_pragati")
public class Usersignup {
	
	@Id
	private int usersignupid;
	private String firstname;
	private String lastname;
	private int phonenumber;
	private String Address;
	private String emailId;
	public int getUsersignupid() {
		return usersignupid;
	}
	public void setUsersignupid(int usersignupid) {
		this.usersignupid = usersignupid;
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
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Usersignup(int usersignupid, String firstname, String lastname, int phonenumber, String address,
			String emailId) {
		super();
		this.usersignupid = usersignupid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phonenumber = phonenumber;
		Address = address;
		this.emailId = emailId;
	}
	public Usersignup() {
		super();
		// TODO Auto-generated constructor stub
	}

}
