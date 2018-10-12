import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class TicketTest {

	/**
	 * Tests the Ticket constructor as well as getters for the
	 * tickets description and timeOrdered.
	 */
	
	@Test
	public void testTicket()
	{
		// Create a Ticket to be tested
		Ticket ticket1 = new Ticket("Grilled cheese", 5);
		
		String expected = "Grilled cheese";
		int time = 5;
		
		// Conduct tests
		Assert.assertEquals(expected, ticket1.getDescription());
		Assert.assertEquals(time, ticket1.getTimeOrdered());
		
	}

	/**
	 * Tests the toString() method. This method should 
	 * return the description.
	 */
	@Test
	public void testToString()
	{
		// Create a Ticket to be tested
		Ticket ticket1 = new Ticket("Grilled cheese", 5);
		String expected = "Grilled cheese";
		
		// Conduct tests
		Assert.assertEquals(expected, ticket1.toString());
		
	}
	
	/**
	 * Tests the compareTo() method. If objectA < objectB return -1.
	 * If objectA > objectB return 1. If objectA == objectB return 0.
	 */
	@Test
	public void testCompareTo()
	{
		// Create Tickets to be tested
		Ticket ticket1 = new Ticket("Grilled cheese", 5);
		Ticket ticket2 = new Ticket("Chicken sandwich", 15);
		Ticket ticket3 = new Ticket("Spaghetti", 5);
		
		// Conduct tests
		Assert.assertEquals(-1, ticket1.compareTo(ticket2));
		Assert.assertEquals(1, ticket2.compareTo(ticket1));
		Assert.assertEquals(0, ticket1.compareTo(ticket3));
		
	}
}
