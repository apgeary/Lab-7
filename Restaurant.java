

public abstract class Restaurant {

	
	
	public abstract boolean addTicket(Ticket order);
		
	protected abstract Ticket checkNextCompletedTicket();
	
	protected abstract Ticket completeTicket();
		
	protected abstract int numberRemainingTickets();
	
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
	
	public String completeTicket(int timeCompleted)
	{
		int totalTime = getTimeOrdered() - timeCompleted;
		String result;
		if (numberRemainingTickets() == 0)
		{
			result = "No orders remain. Could not complete a Ticket.";
		}
		else 
		{
			result = "It took " + 3 + " time units to complete the following "
					+ "order: " + completeTicket().toString();
		}
		return result;
	}
}
