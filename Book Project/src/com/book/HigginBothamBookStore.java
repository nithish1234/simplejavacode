package com.book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HigginBothamBookStore implements BookStore {

	Set<String> categories = new HashSet<>();
	List<Map<String, List<Book>>> inventory = new ArrayList<Map<String, List<Book>>>();
	List<Book> javaBooks = new ArrayList<>();

	public HigginBothamBookStore() {
		inventory.add(JavaCategoryBooks());
		// inventory.add(SqlCategoryBooks());
	}

	private Map<String, List<Book>> JavaCategoryBooks() {

		Book thiningInJava = new Book("Thinking in Java", "1234567890",
				"Bruce Eckle", 1120, 789.90);
		Book completeReference = new Book("Complete Rreference Java",
				"1234567891", "Herbert Schildt", 126, 789.90);
		Book quickJava = new Book("Quick Java", "1234567892",
				"Spencer Bharath", 120, 789.90);
		Book java8Basics = new Book("Java 8 Basics", "1234567893",
				"Nitish Bharath", 420, 789.90);

		javaBooks.add(thiningInJava);
		javaBooks.add(completeReference);
		javaBooks.add(quickJava);
		javaBooks.add(java8Basics);

		Map<String, List<Book>> javaCollections = new HashMap<String, List<Book>>();
		javaCollections.put("Java", javaBooks);

		return javaCollections;
	}

	//
	// private Map<String, List<Book>> SqlCategoryBooks() {
	// Book sqlSample = new Book("sql1", "122121hh1", "nithish", 1123, 90.00);
	// Book sqlreference = new Book("sql2", "122121jj1", "dharshan", 1323,
	// 90.00);
	// Book sqlsending = new Book("sql4", "122121kk1", "spencer", 21123, 90.00);
	// Book sqlyog = new Book("sql5", "12212fjgh1", "manny", 1123, 90.00);
	//
	// List<Book> sqlbook = new ArrayList<>();
	//
	// sqlbook.add(sqlsending);
	// sqlbook.add(sqlreference);
	// sqlbook.add(sqlSample);
	// sqlbook.add(sqlyog);
	//
	// Map<String, List<Book>> sqlBooks = new HashMap<>();
	// sqlBooks.put("SQL", sqlbook);
	// return sqlBooks;
	// }

	@Override
	public void add(String category, Book book) {
		List<Book> books = null;
		Map<String, List<Book>> availableCategory = null;
		int categoryPosition = 0;

		categories = getAllCategoriesFromInventory();

		if (category != null) {
			if (categories.contains(category)) {
				Iterator<Map<String, List<Book>>> itr = inventory.iterator();
				while (itr.hasNext()) {
					categoryPosition++;
					Map<String, List<Book>> categoryWiseBook = itr.next();
					if (categoryWiseBook.get(category) != null) {
						availableCategory = categoryWiseBook;
						books = categoryWiseBook.get(category);
						break;
					}
				}
			}
			books.add(book);
			availableCategory.replace(category, books);
			inventory.add(categoryPosition, availableCategory);
		}
	}

	public void getInventory() {

		categories = getAllCategoriesFromInventory();
		for (String category : categories) {
			Iterator<Map<String, List<Book>>> itr = inventory.iterator();
			while (itr.hasNext()) {
				Map<String, List<Book>> categoryWiseBook = itr.next();
				if (categoryWiseBook.get(category) != null) {
					System.out.println("Books in the category : " + category
							+ " are : " + categoryWiseBook.get(category));
				}
			}

		}
	}

	private Set<String> getAllCategoriesFromInventory() {

		for (Map<String, List<Book>> categoryWiseBook : inventory) {
			Set<String> keys = categoryWiseBook.keySet();
			categories.addAll(keys);
		}
		return categories;
	}

	public void getBookONisbn(String isbn) {
		// Iterator<Map<String, List<Book>>> itr = inventory.iterator();
		String one = "the book is avalible";
		String two = "the book is not avalible";
		Iterator<Book> itr = javaBooks.iterator();
		while (itr.hasNext()){
				if(itr.next().getIsbn().contains(isbn)) {
System.out.println(one);
break;
		}
		else {
			System.out.println(two);
			break;
		}
//			if (itr.next().getIsbn().contains(isbn)) {
//				System.out.println(one+", the book name is "+itr.next().getTitle());
//				break;
//			} 
//			if(!(itr.next().getIsbn().contains(isbn))) {
//				System.out.println(two);
//			}
		}

	}}


