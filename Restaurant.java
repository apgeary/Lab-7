
/**
 * Class representing a Restaurant 
 * 
 * @author Alexander Geary
 * @version 10-11-2018
 *
 */
public abstract class Restaurant {


	
	public abstract boolean addTicket(Ticket order);
		
	protected abstract Ticket checkNextCompletedTicket();
	
	protected abstract Ticket completeTicket();
		
	protected abstract int numberRemainingTickets();
	
	/**
	 * Method checks the current tickets and returns the amount of
	 * tickets left along with the current ticket.
	 * @return String for orders left
	 */
	public String getCurrentStatus()
	{
		String result;
		if (numberRemainingTickets() == 0)
		{
			result = "No orders left.";
		}
		else 
		{
			result = numberRemainingTickets() + " orders left. "
					+ "Working on: " + checkNextCompletedTicket().toString();
		}
		return result;
	}
	
	/**
	 * Completes the next ticket and calculates the time taken to do so.
	 * 
	 * @param timeCompleted the time the ticket was completed
	 * @return 
	 */
	public String completeTicket(int timeCompleted)
	{
		int totalTime = timeCompleted - checkNextCompletedTicket().getTimeOrdered();
		String result;
		if (numberRemainingTickets() == 0)
		{
			result = "No orders remain. Could not complete a Ticket.";
		}
		else 
		{
			result = "It took " + totalTime + " time units to complete the following "
					+ "order: " + completeTicket().toString();
		}
		return result;
	}
}
