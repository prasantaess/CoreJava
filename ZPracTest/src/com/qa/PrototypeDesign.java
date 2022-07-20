package com.qa;

import java.util.ArrayList;
import java.util.List;

class Book{
	private int bookid;
	private String name;

	public Book() {
		
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", name=" + name + "]";
	}
	
	
	
}

class BookStall implements Cloneable{
	
	private String BookStallName;
	
	List<Book> Books= new ArrayList<>();
	
	public String getBookStallName() {
		return BookStallName;
	}
	public void setBookStallName(String bookStallName) {
		BookStallName = bookStallName;
	}
	public List<Book> getBooks() {
		return Books;
	}
	public void setBooks(List<Book> books) {
		Books = books;
	}
	
	public void data() {
		
		for(int i=0;i<5;i++) {
			Book b= new Book();
			b.setBookid(i);
			b.setName("BookName"+i);
			getBooks().add(b);
		}
		
		
	}
	@Override
	public String toString() {
		return "BookStall [BookStallName=" + BookStallName + ", Books=" + Books + "]";
	}
	@Override
	protected BookStall clone() throws CloneNotSupportedException {
		
		BookStall shop= new BookStall();
		for(Book b: this.getBooks()) {
			shop.getBooks().add(b);
		}
		return shop;
	}
	
	
}





public class PrototypeDesign {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		BookStall bs= new BookStall();
		bs.setBookStallName("Prasant Books Stall");
		bs.data();
		BookStall bs1=bs.clone();
		bs1.setBookStallName("Pratima Stall");
		bs1.data();
		System.out.println(bs);
		System.out.println(bs1);
		
	}

}
