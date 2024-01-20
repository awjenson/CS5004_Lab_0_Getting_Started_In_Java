/******
Name: Andrew Jenson
Assignment: Lab 0 - Getting Started in Java
Date: January 21, 2024
Notes: This class represents a book. A book has a title, author, and price.
******/


/**
 * <h1>Book</h1>
 * @author andrewjenson 
 */


/**
 * This class represents a book. A book has a title, an author, and a price.
 */
public class Book {
	/** The title of the book. */
	private String title;
	/** The author of the book. */
	private Person author;
	/** The price of the book. */
	private double price;

	/**
	 * Construct a Book object that has the provided title, author, and  price.
	 *
	 * @param title  the title to be given to this book
	 * @param author the author to be given to this book
	 * @param price  the price to be assigned to this book
	 */
	public Book(String title, Person author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	/**
	 * Get the title of this book.
	 *
	 * @return the title of this book
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	 * Get the price of this book.
	 *
	 * @return the price of this book
	 */
	public double getPrice() {
		return this.price;
	}

	/**
	 * Get the author of this object.
	 *
	 * @return the author of this object as a @link{Person}
	 */
	public Person getAuthor() {
		return this.author;
	}

}