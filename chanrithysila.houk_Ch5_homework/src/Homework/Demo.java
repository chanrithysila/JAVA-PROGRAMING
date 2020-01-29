package Homework;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		Book book1 = new Book("Don't make me think","Steve Krung",2000);
		book1.borrow();
		System.out.println(book1.toString());
		
		Book book2 = new Book("Pro Java Programming","Terrill",2005);
		book2.returnBack();
		System.out.println(book2.toString());
		
		Book book3 = new Book("Programming in Python 3","Mark Summerfield",2005);
		book3.borrow();
		System.out.println(book3.toString());
		
		Book book4 = new Book("The Clean Coder","Robert",2011);
		book4.borrow();
		System.out.println(book4.toString());
		
		Book book5 = new Book("The Art of Agile Development","James Shore",2007);
		book5.returnBack();
		System.out.println(book5.toString());
		
		Book book6 = new Book("Head First Design Patterns","Eric Freeman",2004);
		book6.returnBack();
		System.out.println(book6.toString());
		
		Book book7 = new Book("The Linux Command Line","Willian",2009);
		book7.borrow();
		System.out.println(book7.toString());
		
		Book book8 = new Book("Code Complete","Steve",1993);
		book8.returnBack();
		System.out.println(book8.toString());
		
		Book book9 = new Book("Unit Test Patterns","Gerard Meszaros",2003);
		book9.returnBack();
		System.out.println(book9.toString());
		
		Book book10 = new Book("The C++ Programming Language","Bjarne Stroustup",2013);
		book10.borrow();
		System.out.println(book10.toString());

		
		
		List<Book> book = new ArrayList<>();
		System.out.println(String.format("%s", "------------------------------------------------------------------------------------------"));
		System.out.println(String.format("%30s %25s %10s %20s", "TITLE", "AUTHOR", "YEAR", "STATUS"));
		System.out.println(String.format("%s", "------------------------------------------------------------------------------------------"));
		
		book.add(book1);
		book.add(book2);
		book.add(book3);
		book.add(book4);
		book.add(book5);
		book.add(book6);
		book.add(book7);
		book.add(book8);
		book.add(book9);
		book.add(book10);
		
		
		for(Book Book:book) {
			System.out.println(String.format("%30s %25s %10s %20s",
					Book.getTitle(),Book.getAuthor(),Book.getPublishYear(),Book.isBorrowed()));
		}
		
		System.out.println(String.format("%s", "------------------------------------------------------------------------------------------"));
	}
}
