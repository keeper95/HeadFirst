package com.headfirst.books;

public class BooksTestDrive {

	public static void main(String[] args) {

		Books[] myBooks = new Books[3];

		myBooks[0] = new Books("The Grapes of Java.", "bob");
		myBooks[1] = new Books("The Java Gatsby.", "sue");
		myBooks[2] = new Books("The Java Cookbook.", "ian");

		for (int i = 0; i < myBooks.length; i++) {
			System.out.println("Book: " + myBooks[i].title + " by " + myBooks[i].author);
		}
	}
}