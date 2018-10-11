
import java.util.LinkedList;
import java.util.Queue;


/**
 * 
 * @author Alexander Geary
 * @version 10-11-2018
 * 
 * QueueRestaurant creates a Restaurant with a ticket Queue used to 
 * store tickets. "First in - First out"
 *
 */
public class QueueRestaurant extends Restaurant{

	
	/** represents the maximum allowed number of tickets in Queue*/
	private int maxSize;
	
	/** Queue for the Restaurants tickets*/
	private Queue<Ticket> tickets;

	/**
	 * Constructor for Restaurant Queue
	 * @param maxSize the maximum allowed tickets in Queue
	 */
	public QueueRestaurant(int maxSize)
	{
		
		this.maxSize = maxSize;
	
		tickets = new LinkedList<Ticket>();
		
	}
	
	/**
	 * Adds the given ticket to the Queue
	 * 
	 * @param order, the ticket to add to the queue
	 * @return true if ticket was added/false otherwise
	 */
	public boolean addTicket(Ticket order)
	{
		// Ensure max size isn't reached already
		if (tickets.size() < maxSize)
		{
			tickets.add(order);
			
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	/**
	 * Checks to see the next ticket in the queue without removing
	 * the ticket.
	 * @return the next ticket in the Queue.
	 */
	protected Ticket checkNextCompletedTicket()
	{
		return tickets.peek();
		
	}
	
	/**
	 * Completes the next Ticket in the Queue.
	 * @return the ticket that was completed and removed from queue.
	 */
	protected Ticket completeTicket()
	{
		 
		if (tickets.peek() != null)
		{
			return tickets.remove();
			
		}
		
		else
		{
			return null;
		}
	}
	
	/**
	 * Returns the remaining number of Tickets in the queue
	 * @return the number of tickets remaining.s
	 */
	protected int numberRemainingTickets()
	{
		return tickets.size();
	}
}
