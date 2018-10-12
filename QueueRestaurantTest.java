import org.junit.Test;

import junit.framework.Assert;

/**
 * 
 * @author Alexander Geary
 * @version 10-11-2018
 * 
 * Tests the QueueRestaurant Class
 *
 */
@SuppressWarnings("deprecation")
public class QueueRestaurantTest {

	/**
	 * Tests the QueueRestaurant Constructor and 
	 * numberRemainingTickets method
	 */
	@Test
	public void testQueueRestaurant()
	{
		// Set up QueueRestaurant and add tickets
		Restaurant resQueue = new QueueRestaurant(10);
		Ticket ticket1 = new Ticket("Grilled cheese", 10);
		Ticket ticket2 = new Ticket("Spaghetti", 20);
		Ticket ticket3 = new Ticket("Surf and Turf", 25);
		Ticket ticket4 = new Ticket("Popcorn Chicken", 30);
		resQueue.addTicket(ticket1);
		resQueue.addTicket(ticket2);
		resQueue.addTicket(ticket3);
		resQueue.addTicket(ticket4);
		
		int expected = 4;
		
		// Conduct tests
		Assert.assertEquals(expected, resQueue.numberRemainingTickets());
			
	}
	
	/**
	 * Tests the addTicket() method for QueueRestaurant
	 */
	@Test
	public void testAddTicket()
	{
		// Set up QueueRestaurant and create tickets to be added
		Restaurant resQueue = new QueueRestaurant(1);
		Ticket ticket1 = new Ticket("Grilled cheese", 10);
		Ticket ticket2 = new Ticket("Spaghetti", 20);
		boolean expected = true;
		
		// Conduct tests
		Assert.assertEquals(expected, resQueue.addTicket(ticket1));
		expected = false;
		Assert.assertEquals(expected, resQueue.addTicket(ticket2));
			
	}

	/**
	 * Tests the checkNextCompletedTicket method. Correct logic is
	 * "First in - First out". 
	 */
	@Test
	public void testCheckNextCompletedTicket()
	{
		// Setup QueueRestaurant, create and add tickets
		Restaurant resQueue = new QueueRestaurant(10);		
		Ticket ticket1 = new Ticket("Grilled cheese", 10);
		Ticket ticket2 = new Ticket("Spaghetti", 20);
		resQueue.addTicket(ticket1);
		resQueue.addTicket(ticket2);
		
		// Conduct tests
		Assert.assertEquals(ticket1, resQueue.checkNextCompletedTicket());
		resQueue.completeTicket();
		Assert.assertEquals(ticket2, resQueue.checkNextCompletedTicket());
	}

	/**
	 * Tests completeTicket() method. Tests both with and without 
	 * a next ticket available to complete.
	 */
	@Test
	public void testCompleteTicket()
	{
		// Setup the test
		Restaurant resQueue = new QueueRestaurant(10);		
		Ticket ticket1 = new Ticket("Grilled cheese", 10);
		resQueue.addTicket(ticket1);
		
		// Conduct tests
		Assert.assertEquals(ticket1, resQueue.completeTicket());
		String expected = null;
		Assert.assertEquals(expected, resQueue.completeTicket());
	}

	


}
