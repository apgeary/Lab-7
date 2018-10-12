

/**
 * 
 * @author Alexander Geary
 * @version 10-11-2018
 * 
 * Ticket Class creates an object representing a food prep ticket.
 * 
 * 
 *
 */
public class Ticket implements Comparable<Ticket>{

	/** String representation of the order on the ticket */
	private String description;
	
	/** Int representing the time the order was initially made */
	private int timeOrdered;
	
	/** 
	 * Constructor for Ticket. 
	 * @param description, brief description of what is to be ordered.
	 * @param timeOrdered, the initial time the order was made. 
	 */
	public Ticket(String description, int timeOrdered)
	{
		this.description = description;
		this.timeOrdered = timeOrdered;
	}
	

	public String getDescription()
	{
		return description;
	}
	
	public int getTimeOrdered()
	{
		return timeOrdered;
		
	}
	
	/**
	 * toString() method for Ticket
	 * 
	 * @return description
	 */
	public String toString()
	{
		return description;
	}
	
	/**
	 * Compares the time ordered of two tickets. 
	 * return -1 if timeA < timeB
	 * return 1 if timeA > timeB
	 * return 0 if timeA == timeB
	 */
	@Override
	public int compareTo(Ticket other)
	{
		int result = 0;
		if (getTimeOrdered() < other.getTimeOrdered())
		{
			result = -1;
		}
		else if (getTimeOrdered() > other.getTimeOrdered())
		{
			result = 1;
		}
		
		return result;
	}

}
