package com.book;

public interface BookStore {

	void add(String category, Book book);
	void getInventory();
	void getBookONisbn(String isbn);
}
