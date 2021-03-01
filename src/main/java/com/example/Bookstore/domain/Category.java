package com.example.Bookstore.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	public Long categoryid; // oli pakko vaihtaa privatesta publiciin että toimii
	public String categoryname;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
	private List<Book> books;
	
	
	
	
	public Category() {}
	
	public Category(String categoryname) {
		super();
		this.categoryname = categoryname;
	}
	
	
	
	public Long getCategoryId() {
		return categoryid;
	}
	
	public void setCategoryId(Long categoryid) {
		this.categoryid = categoryid;
	}
	
	public String getCategoryName() {
		return categoryname;
	}
	
	public void setCategoryName(String categoryname) {
		this.categoryname = categoryname;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Category [categoryid=" + categoryid + ", categoryname=" + categoryname + "]";
	}
}