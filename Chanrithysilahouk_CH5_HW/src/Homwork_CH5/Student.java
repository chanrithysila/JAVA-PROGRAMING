package Homwork_CH5;

import java.util.ArrayList;



public class Student extends Demo {
	private String firstName;
	private String batch;
	private  ArrayList<Book> bookCart ;
	
	Student(String firstName, String batch){
		this.firstName = firstName;
		this.batch = batch;
		bookCart = new ArrayList<Book>();
	}
	
	public void borrowedBook(Book book) {
		
		if(bookCart.size()<3) {
			if(book.isBorrowed()) {
				System.out.println("This book isn't Available");
			}else {
				bookCart.add(book);
				//change status to borrow
				book.borrow();
			}
		}else {
			System.out.println("You could borrow only maximum 3 books");
			
		}
	}
	public void returnBook(Book book) {
		if(bookCart.contains(book)) {
			book.returnBack();
			bookCart.remove(book);
		}else {
			System.out.println("You didn't borrow this book");
		}
		
	}
	public void getBookCart(ArrayList<Book> bookCart) {
		
		this.bookCart = bookCart;
	}
	public String toString() {
		String borrow = "";
		for(Book book : bookCart) {
			borrow += book.getTitle() + "\n";
		}
		return  firstName + " of class "+ batch + " has borrowed: \n" + borrow ;
	}

	
	
}
