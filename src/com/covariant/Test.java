package com.covariant;

class Book {

	 Integer read() {
		System.out.println("Can't read a book");
		return null;
	}
}

class ScientificBook extends Book {	
	Integer read() {
		System.out.println("Can read a scientific book");
		return null;
	}

}

public class Test {
	public static void main(String[] args) {
		Book book = new Book();
		book.read();

		ScientificBook scientificBook = new ScientificBook();
		scientificBook.read();

		Book books = new ScientificBook();
		books.read();
	}

}
