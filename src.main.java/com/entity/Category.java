package com.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int catId;
	@Column(length=150)
	private String catTitle;
	@Column(length = 400)
	private String catDescription;

	@OneToMany(mappedBy = "category")
	private List<Product> product = new ArrayList<Product>(); // we can use here hashSet so no duplicacy occur
	
	                           /* Constructors  Start */
	
	public Category(int catId, String catTitle, String catDescription,
			List<Product> product) {
		super();
		this.catId = catId;
		this.catTitle = catTitle;
		this.catDescription = catDescription;
		this.product = product;
	}

	public Category(String catTitle, String catDescription,
			List<Product> product) {
		super();
		this.catTitle = catTitle;
		this.catDescription = catDescription;
		this.product = product;
	}

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}       
	                         
	                         /* Constructors END */

	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

	public String getCatTitle() {
		return catTitle;
	}

	public void setCatTitle(String catTitle) {
		this.catTitle = catTitle;
	}

	public String getCatDescription() {
		return catDescription;
	}

	public void setCatDescription(String catDescription) {
		this.catDescription = catDescription;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

}
