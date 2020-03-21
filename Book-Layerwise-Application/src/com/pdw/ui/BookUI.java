package com.pdw.ui;

import com.pdw.services.BookService;

import java.util.Scanner;

public class BookUI {
	public static void main(String[] args) // 1.
	{
		int bookId = 0;
		String title = "";
		float price = 0;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Book BooId");
		bookId = s.nextInt();
		System.out.println("Enter Book Titile");
		title = s.next();
		System.out.println("Enter Book price");
		price = s.nextFloat();

		BookService bookService = new BookService(); // 2.

		int updateCount = bookService.addBookService(bookId, title, price); // 3.
		// . 20
		System.out.println("inserted " + updateCount + " record   Success");
		// .21
	} // 22

} // 23.

