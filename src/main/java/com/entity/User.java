package com.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 20)
	private String name;
	@Column(length = 12)
	private String number;
	private String email;
	@Column(length = 16)
	private String password;
	@Column(name = "User_address", length = 100)
	private String address;
	private String pic;
	@Column(name="TYPE")
	private String user_type;
	
	 private Date date;

	// Constructer with all field
	public User(int id, String name, String number, String email,
			String password, String address, String pic , Date date , String user_type) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.email = email;
		this.password = password;
		this.address = address;
		this.pic = pic;
		this.date = date;
		this.user_type=user_type;
	}

	// Constructer without id field
	public User(String name, String number, String email, String password,
			String address, String pic , Date date , String user_type) {
		super();
		this.name = name;
		this.number = number;
		this.email = email;
		this.password = password;
		this.address = address;
		this.pic = pic;
		this.date = date;
		this.user_type=user_type;
	}

	// Simple Constructer
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Getter And Setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

}
