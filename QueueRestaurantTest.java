import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class QueueRestaurantTest {

	@SuppressWarnings("deprecation")
	@Test
	public void testQueueRestaurant()
	{
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
		
		Assert.assertEquals(expected, resQueue.numberRemainingTickets());
		
	
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testAddTicket()
	{
		Restaurant resQueue = new QueueRestaurant(10);
		
		Ticket ticket1 = new Ticket("Grilled cheese", 10);
		boolean expected = true;
		Assert.assertEquals(expected, resQueue.addTicket(ticket1));
		
		Restaurant resQueue2 = new QueueRestaurant(1);
		Ticket ticket2 = new Ticket("Spaghetti", 20);
		
		resQueue2.addTicket(ticket1);
		expected = false;
		Assert.assertEquals(expected, resQueue2.addTicket(ticket2));
	
		
		
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testCheckNextCompletedTicket()
	{
		// Setup the test
		Restaurant resQueue = new QueueRestaurant(10);		
		Ticket ticket1 = new Ticket("Grilled cheese", 10);
		Ticket ticket2 = new Ticket("Spaghetti", 20);
		resQueue.addTicket(ticket1);
		resQueue.addTicket(ticket2);
		
		Assert.assertEquals(ticket1, resQueue.checkNextCompletedTicket());
		resQueue.completeTicket();
		Assert.assertEquals(ticket2, resQueue.checkNextCompletedTicket());
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testCompleteTicket()
	{
		// Setup the test
		Restaurant resQueue = new QueueRestaurant(10);		
		Ticket ticket1 = new Ticket("Grilled cheese", 10);
		resQueue.addTicket(ticket1);
		
		Assert.assertEquals(ticket1, resQueue.completeTicket());
		String expected = null;
		Assert.assertEquals(expected, resQueue.completeTicket());
	}

	


}
