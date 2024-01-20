/******
Name: Andrew Jenson
Assignment: Lab 0 - Getting Started in Java
Date: January 21, 2024
Notes: JUnit test class for the Book class.
******/


/**
 * <h1>BookTest</h1>
 * @author andrewjenson 
*/


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * A JUnit test class for the Book class.
 */
public class BookTest {
	
	/** Test person for JUnit tests. */
	private Person stephen;
	/** Test book for JUnit tests. */
	private Book shining;
		
	/**
	 * Creates example Person objects for testing
	 */
	@Before
	public void setUp() {	
		stephen = new Person("Stephen", "King", 1947);
		shining = new Book("The Shining", stephen, 19.99);
	}
	
	/**
	 * Tests getTitle method
	 */
	@Test
	public void testGetTitle() {
		assertEquals("The Shining", shining.getTitle());
	}

	/**
	 * Tests getPrice method
	 */
	@Test
	public void testGetPrice() {
		assertEquals(19.99, shining.getPrice(), 0.001);
	}

	/**
	 * Tests getAuthor method
	 */
	@Test
	public void testGetAuthor() {	
		assertEquals(stephen, shining.getAuthor());
	}

}
