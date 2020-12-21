package com.basicsstrong.reactive.section1;

public class ObserverDesignPattern {

	public static void main(String[] args) {
		
		Book book = new Book("Goosebumps", "Horror", "Xyz", 200, "SoldOut");
		
		EndUser user1 = new EndUser("Bob", book);
		EndUser user2 = new EndUser("Rob", book);
		
		System.out.println(book.getInStock());
		
		book.setInStock("In Stock");
		
	}

}

