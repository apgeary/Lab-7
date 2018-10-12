import org.junit.Test;

import junit.framework.Assert;

/**
 * 
 * @author Alexander Geary
 * @version 10-11-2018
 * 
 * Tests the StackRestaurant Class
 *
 */
@SuppressWarnings("deprecation")
public class StackRestaurantTest {

	/**
	 * Tests the StackRestaurant constructor and the 
	 * numberRemainingTickets method.
	 */
	@Test
	public void testStackRestaurant()
	{
		// Create a StackRestaurant and tickets
		Restaurant resStack = new StackRestaurant();
		Ticket ticket1 = new Ticket("Grilled cheese", 10);
		Ticket ticket2 = new Ticket("Spaghetti", 20);
		Ticket ticket3 = new Ticket("Surf and Turf", 25);
		Ticket ticket4 = new Ticket("Popcorn Chicken", 30);
		
		// Add tickets
		resStack.addTicket(ticket1);
		resStack.addTicket(ticket2);
		resStack.addTicket(ticket3);
		resStack.addTicket(ticket4);
		
		int expected = 4;
		
		// Conduct tests
		Assert.assertEquals(expected, resStack.numberRemainingTickets());
		
	}

	/**
	 * Tests the addTicket method for StackRestaurant
	 */
	@Test
	public void testAddTicket()
	{
		// Create a StackRestaurant and ticket to add
		Restaurant resStack = new StackRestaurant();
		Ticket ticket1 = new Ticket("Grilled cheese", 10);
		
		boolean expected = true;
		
		Assert.assertEquals(expected, resStack.addTicket(ticket1));
		
		
		
		
	}
	
	@Test
	public void testCheckNextCompletedTicket()
	{
		Restaurant resStack = new StackRestaurant();
		
		Ticket ticket1 = new Ticket("Grilled cheese", 10);
		Ticket ticket2 = new Ticket("Spaghetti", 20);
		resStack.addTicket(ticket1);
		resStack.addTicket(ticket2);
				
		Assert.assertEquals(ticket2, resStack.checkNextCompletedTicket());
		
	}
	
	@Test
	public void testCompleteTicket()
	{
		Restaurant resStack = new StackRestaurant();
		
		Ticket ticket1 = new Ticket("Grilled cheese", 10);
		Ticket ticket2 = new Ticket("Spaghetti", 20);
		Ticket expected = null;
		
		resStack.addTicket(ticket1);
		resStack.addTicket(ticket2);
		
		Assert.assertEquals(ticket2, resStack.completeTicket());
		Assert.assertEquals(ticket1, resStack.completeTicket());
		Assert.assertEquals(expected, resStack.completeTicket());
	}
	
	
}
