package com.pdw.services;
import java.util.ArrayList;

import com.pdw.beans.BookBean;
import com.pdw.dao.BookDAO;

public class BookService implements BookServiceI  //4,
{
 public int addBookService(int bookId, String title, float price)//5.
 { 	 //implement the business logic
	 String grade="";
	 if(price <= 300)
		 grade = "C";
	 else if(price <= 600)
		 grade = "B";
	 else
		 grade = "A";
	 BookDAO bookDAO = new BookDAO(); //6.
	 BookBean bookBean = new BookBean(); //7.
	 //wrap up all the four field values into bean
	 bookBean.setBookId(bookId);
	 bookBean.setTitle(title);
	 bookBean.setPrice(price);
	 bookBean.setGrade(grade);
	 int updateResult = 0;
	 try
	 {
		 updateResult = bookDAO.addBook(bookBean); //8.
		 return updateResult; //19.
	 }
	 catch(Exception ex)
	 {
		 System.out.println(ex.toString());
		 return 0;
	 }
 }

public int addBook(BookBean bookBean) {
	// TODO Auto-generated method stub
	return 0;
}

public ArrayList getBookDetailsById(int bookId) throws Exception {
	// TODO Auto-generated method stub
	return null;
}

public int addBook(int bookId, String title, float price) {
	// TODO Auto-generated method stub
	return 0;
}
 
 
 
}
