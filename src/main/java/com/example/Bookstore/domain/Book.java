package com.example.Bookstore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity

public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	// attribuutit
	
	    private long id;
	
		private String title;
		private String author;
		private String year;
		private String isbn;
		private String price;
		
	 @ManyToOne
	 @JoinColumn(name = "categoryid")
		 private Category category;
	 
	
		
		//konstruktorit ilman atribuutteja
		public Book() {}
		

		//konstruktorit 
		public Book(String title, String author, String year, String isbn, String price, Category category) {
			super();
			this.title = title;
			this.author = author;
			this.year = year;
			this.isbn = isbn;
			this.price = price;
			this.category = category;
		}
		
		
		//setterit
		
		public void setId(long id) {
			this.id = id;
		}

		public void setTitle(String title) {
			this.title = title;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public void setYear(String year) {
			this.year = year;
		}
		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}
		public void setPrice(String price) {
			this.price = price;
		}
		public void setCategory(Category category) {
			this.category = category;
		}
		
		// getterit
		public Long getId() {
			return id;
		}
		
		public String getTitle() {
			return title;
		}
		public String getAuthor() {
			return author;
		}
		public String getYear() {
			return year;
		}
		public String getIsbn() {
			return isbn;
		}
		public String getPrice() {
			return price;
		}
		public Category getCategory() {
			return category;
		}
		
		// toString
		
		@Override
		public String toString() {
			return "Bookstore [title=" + title + ", author= " + author +", year=" + year + ", isbn=" + isbn + ", price=" + price + " category =" + this.getCategory() +"]";
		}
		
	}