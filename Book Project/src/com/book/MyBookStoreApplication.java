package com.book;

public class MyBookStoreApplication {

	public static void main(String[] args) {
		BookStore higginBothem = new HigginBothamBookStore();
		higginBothem.getInventory();

		higginBothem.add("Java", new Book(" Java refrence", "123", "mannya", 23, 67.0));
		higginBothem.getInventory();
		higginBothem.getBookONisbn("123");
	}

}
