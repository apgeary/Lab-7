import org.junit.Test;

import junit.framework.Assert;

/**
 * 
 * @author Alexander Geary
 * @version 10-11-2018
 * 
 * Tests the abstract class Restaurant
 *
 */
@SuppressWarnings("deprecation")
public class RestaurantTest {

	/**
	 * Tests the getCurrentStatus method. 
	 */
	@Test
	public void testGetCurrentStatus()
	{
		// Create a Restaurant and tickets to test
		Restaurant myRestaurant = new QueueRestaurant(5);
		Ticket ticket1 = new Ticket("Grilled cheese", 5);
		Ticket ticket2 = new Ticket("Chicken sandwich", 10);
		
		// Add tickets to Restaurant
		myRestaurant.addTicket(ticket1);
		myRestaurant.addTicket(ticket2);
		
		// Create expected String
		String expected = "2 orders left. Working on: Grilled cheese";
		
		// Conduct tests
		Assert.assertEquals(expected, myRestaurant.getCurrentStatus());
		myRestaurant.completeTicket();
		expected = "1 orders left. Working on: Chicken sandwich";
		Assert.assertEquals(expected, myRestaurant.getCurrentStatus());
		myRestaurant.completeTicket();
		expected = "No orders left.";
		Assert.assertEquals(expected, myRestaurant.getCurrentStatus());
		
				
	}
	
	/**
	 * Tests the completeTicket method. Return the amount of time 
	 * taken to complete the ticket.
	 */
	@Test
	public void testCompleteTicket()
	{
		// Create a Restaurant and tickets for tests
		Restaurant myRestaurant = new QueueRestaurant(5);
		Ticket ticket1 = new Ticket("Grilled cheese", 5);
		Ticket ticket2 = new Ticket("Chicken sandwich", 15);
		
		// Add tickets to Restaurant
		myRestaurant.addTicket(ticket1);
		myRestaurant.addTicket(ticket2);
		
		String expected = "It took 15 time units to complete the following order: Grilled cheese";
		
		// Conduct tests
		Assert.assertEquals(expected, myRestaurant.completeTicket(20));
		expected = "It took 5 time units to complete the following order: Chicken sandwich";
		Assert.assertEquals(expected, myRestaurant.completeTicket(20));
		expected = "No orders remain. Could not complete a Ticket.";
		Assert.assertEquals(expected, myRestaurant.completeTicket(20));
		
		
	}

}
