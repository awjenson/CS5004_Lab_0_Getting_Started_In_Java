/******
Name: Andrew Jenson
Assignment: Lab 0 - Getting Started in Java
Date: January 21, 2024
Notes: This class represents a movie. A movie has a title, a director, and a year of release.
******/


/**
 * <h1>Movie</h1>
 * @author andrewjenson 
 */


/**
 * This class represents a movie. A movie has a title, a director, and a year of release.
 */
public class Movie {
	/** The title of the movie. */
	private String title;
	/** The director of the movie. */
	private Person director;
	/** The year the movie was released. */
	private int yearOfRelease;

	/**
	 * Construct a Movie object that has the provided title, director, and a year of release.
	 *
	 * @param title         the title to be given to this movie
	 * @param director      the director of this movie
	 * @param yearOfRelease the year the movie was released
	 */
	public Movie(String title, Person director, int yearOfRelease) {
		this.title = title;
		this.director = director;
		this.yearOfRelease = yearOfRelease;
	}
	
	/**
	 * Get the title of this movie.
	 *
	 * @return the title of this movie
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	 * Get the year the movie was released.
	 *
	 * @return the year the movie was released
	 */
	public int getYearOfRelease() {
		return this.yearOfRelease;
	}

	/**
	 * Get the director of this object.
	 *
	 * @return the director of this object as a @link{Person}
	 */
	public Person getDirector() {
		return this.director;
	}

}