package com.hms.API.steps.practice;

public class Book {
	private String category;
	private String author;
	private String title;
	private String isbn;
	private float price;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String bookInfo() {
		return "Book Info: category = " + category + ", author = " + author + ", title = " + title + ", isbn = " + isbn
				+ ", price = " + price;
	}
}