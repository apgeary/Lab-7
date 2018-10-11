import java.util.Calendar;

import java.util.LinkedList;
import java.util.Queue;

public class QueueRestaurant extends Restaurant{

	
	private int timeIn;
	private int maxSize;
	private int ticketAmount;
	private Queue<Ticket> tickets;

	
	public QueueRestaurant(int maxSize)
	{
		
		this.maxSize = maxSize;
		ticketAmount = 0;
		tickets = new LinkedList<Ticket>();
		
	}
	
	public boolean addTicket(Ticket order)
	{
		if (ticketAmount < maxSize)
		{
			tickets.add(order);
			ticketAmount = tickets.size();
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	protected Ticket checkNextCompletedTicket()
	{
		return tickets.peek();
		
	}
	
	protected Ticket completeTicket()
	{
		 
		if (tickets.peek() != null)
		{
			long timeDiff = tickets.getTimeOrdered() - tickets.peek().getTimeOrdered();
			
		}
	}
	
	protected int numberRemainingTickets()
	{
		return tickets.size();
	}
}
