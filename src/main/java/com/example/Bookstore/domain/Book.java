package com.example.Bookstore.domain;


public class Book {

		// attribuutit
		private String title;
		private String author;
		private String year;
		private String isbn;
		private String price;
		
		//konstruktorit
		public Book() {
			super();
			this.title = null;  
			this.author = null;
			this.year = null;
			this.isbn = null;
			this.price = null;	
		}
		
		public Book(String firstname, String lastname, String year, String isbn, String price) {
			super();
			this.title = title;
			this.author = author;
			this.year = year;
			this.isbn = isbn;
			this.price = price;
		}
		
		//setterit

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
		
		
		// getterit
		
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
		
		// toString
		
		@Override
		public String toString() {
			return "Bookstore [title=" + title + ", author= " + author +", year=" + year + ", isbn=" + isbn + ", price=" + price +"]";
		}
		
	}