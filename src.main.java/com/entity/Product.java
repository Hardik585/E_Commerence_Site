package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int proId;
	private String proName;
	@Column(length=150)
	private String proTitle;
	@Column(length=400)
	private String proDiscription;
	private String proDescount;
	private String proPic;

	@ManyToOne
	private Category category;

	                                 /* Constructors START */

	public Product(int proId, String proName, String proTitle,
			String proDiscription, String proDescount, String proPic,
			Category category) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.proTitle = proTitle;
		this.proDiscription = proDiscription;
		this.proDescount = proDescount;
		this.proPic = proPic;
		this.category = category;
	}

	public Product(String proName, String proTitle, String proDiscription,
			String proDescount, String proPic, Category category) {
		super();
		this.proName = proName;
		this.proTitle = proTitle;
		this.proDiscription = proDiscription;
		this.proDescount = proDescount;
		this.proPic = proPic;
		this.category = category;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	                                          /* Constructors END */

	public int getProId() {
		return proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public String getProTitle() {
		return proTitle;
	}

	public void setProTitle(String proTitle) {
		this.proTitle = proTitle;
	}

	public String getProDiscription() {
		return proDiscription;
	}

	public void setProDiscription(String proDiscription) {
		this.proDiscription = proDiscription;
	}

	public String getProDescount() {
		return proDescount;
	}

	public void setProDescount(String proDescount) {
		this.proDescount = proDescount;
	}

	public String getProPic() {
		return proPic;
	}

	public void setProPic(String proPic) {
		this.proPic = proPic;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
