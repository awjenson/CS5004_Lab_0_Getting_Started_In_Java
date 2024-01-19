/******
Name: Andrew Jenson
Assignment: Lab 0 - Getting Started
Date: January 21, 2024
Notes: This class represents a person. A person has a first name, last name, and year of birth.
******/


/**
 * <h1>Person</h1>
 * @author andrewjenson 
 */


/**
 * This class represents a person. A person has a first name, last name, and year of birth.
 */
public class Person {
	/** The first name of the person. */
	private String firstName;
	/** The last name of the person. */
	private String lastName;
	/** The year of birth of the person. */
	private int yearOfBirth;

	/**
	 * Constructs a Person object and initializes it to the given first name, last name, and 
	 * year of birth.
	 *
	 * @param firstName   the first name of this person
 	 * @param lastName    the last name of this person
 	 * @param yearOfBirth the year of birth of this person
 	 */
	public Person(String firstName, String lastName, int yearOfBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearOfBirth = yearOfBirth;
	}

	/**
	 * Get the first name of this person.
	 *
	 * @return the first name of this person
	 */
	public String getFirstName() {
		return this.firstName;
	}

	/**
	 * Get the last name of this person.
	 *
	 * @return the last name of this person
	 */
	public String getLastName() {
		return this.lastName;
	}

	/**
	 * Get the full name of this person.
	 *
	 * @return the full name of this person
	 */
	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}
  
	/**
	 * Get the year of birth of this person.
	 *
	 * @return the year of birth of this person
	 */
	public int getYearOfBirth() {
		return this.yearOfBirth;
	}
	
}