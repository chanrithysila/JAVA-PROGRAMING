package Homework;

public class Book extends Demo{
	private String author;
	private String title;
	private int publishYear;
	private boolean isBorrowed;
	
	
	public Book(String title, String author, int publishYear) {
		this.title = title;
		this.author = author;
		this.publishYear = publishYear;
	}
	
	public void borrow() {
		this.isBorrowed= true;
	}
	public void returnBack() {
		this.isBorrowed = false;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getPublishYear() {
		return publishYear;
	}
	public String isBorrowed() {
		String status;
		if(isBorrowed) {
			status= "Not available";
		}else {
			status= "Available";
		}
		return status;
	}
	public String toString() {
		isBorrowed();
		return "\n"+ "Title: " + title + "\n\t by " + author + "--published " + publishYear + "\n\t Status: " + isBorrowed() + " to Borrowed" +"\n\t";
	}
}
