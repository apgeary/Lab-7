
import java.util.Stack;

public class StackRestaurant extends Restaurant{

	
	/** Stack of currently active tickets*/
	private Stack<Ticket> tickets;
	
	/** 
	 * Constructor for Restaurant Ticket Stack
	 * 
	 * */
	public StackRestaurant()
	{
		
		
		tickets = new Stack<Ticket>();
	}
	
	/**
	 * Adds a ticket to the Stack and returns true if the 
	 * ticket was added.
	 */
	public boolean addTicket(Ticket order)
	{
		tickets.push(order);
		
		return true;
		
	}
	
	/**
	 * Checks the next Ticket in the Stack without removing it. 
	 * @return the next Ticket to be completed
	 */
	protected Ticket checkNextCompletedTicket()
	{
		return tickets.peek();
	}
	
	/**
	 * Removes and returns the next completed Ticket in the Stack.
	 * @return the Ticket to be completed
	 */
	protected Ticket completeTicket()
	{
		return tickets.pop();
	}
	
	/**
	 * Returns the current number of Tickets remaining in the Stack.
	 * @return the number of Tickets
	 */
	protected int numberRemainingTickets()
	{
		return tickets.size();
	}
}
