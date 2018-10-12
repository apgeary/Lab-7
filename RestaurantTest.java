import static org.junit.Assert.*;

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
public class RestaurantTest {

	/**
	 * Tests the getCurrentStatus method. 
	 */
	@SuppressWarnings("deprecation")
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
		
		fail("Not yet implemented");
	}
	
	@Test
	public void testCompleteTicket()
	{
		Restaurant myRestaurant = new QueueRestaurant(5);
		
		
		
		fail("Not yet implemented");
	}

}
