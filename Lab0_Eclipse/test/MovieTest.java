/******
Name: Andrew Jenson
Assignment: Lab 0 - Getting Started in Java
Date: January 21, 2024
Notes: JUnit test class for the Movie class.
******/


/**
 * <h1>MovieTest</h1>
 * @author andrewjenson 
*/


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * A JUnit test class for the Movie class.
 */
public class MovieTest {
	
	/** Test person for JUnit tests. */
	private Person alfred;
	/** Test movie for JUnit tests. */
	private Movie vertigo;
		
	/**
	 * Creates example Person objects for testing.
	 */
	@Before
	public void setUp() {	
		alfred = new Person("Alfred", "Hitchcock", 1899);
		vertigo = new Movie("Vertigo", alfred, 1958);
	}
	
	/**
	 * Tests getTitle method
	 */
	@Test
	public void testGetTitle() {
		assertEquals("Vertigo", vertigo.getTitle());
	}

	/**
	 * Tests getStarRating method
	 */
	@Test
	public void testGetPrice() {
		assertEquals(1958, vertigo.getYearOfRelease(), 0.001);
	}

	/**
	 * Tests getDirector method
	 */
	@Test
	public void testGetDirector() {	
		assertEquals(alfred, vertigo.getDirector());
	}

}
