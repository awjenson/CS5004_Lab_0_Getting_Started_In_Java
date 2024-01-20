/******
Name: Andrew Jenson
Assignment: Lab 0 - Getting Started in Java
Date: January 21, 2024
Notes: JUnit test class for the Person class.
******/


/**
 * <h1>PersonTest</h1>
 * @author andrewjenson 
*/


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * A JUnit test class for the Person class.
 */
public class PersonTest {


	/** Test person for JUnit tests. */
	private Person john;

	/**
	 * * setUp method creates example Person objects for testing
	 * */
	@Before
	public void setUp() {
		john = new Person("John", "Doe", 1945);
	}

	/**
	 * Tests getFirstName method
	 */
	@Test
	public void testGetFirstName() {
		assertEquals("John", john.getFirstName());
	}

	/**
	 * Tests getLastName method
	 */
	@Test
	public void testGetLastName() {
		assertEquals("Doe", john.getLastName());
	}
  
	/**
	 * Tests getFullName method
	 */
	@Test
	public void testGetFullName() {
		assertEquals("John Doe", john.getFullName());
	}
  
	/**
	 * Tests getGetYearOfBirth method
	 */
	@Test
	public void testGetYearOfBirth() {
		assertEquals(1945, john.getYearOfBirth());
	}

}
