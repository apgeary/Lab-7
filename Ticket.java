
public class Ticket implements Comparable<Ticket>{

	private String description;
	
	private int timeOrdered;
	
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
	
	public String toString()
	{
		return description;
	}
	
	@Override
	public int compareTo(Ticket other)
	{
		if (getTimeOrdered() < other.getTimeOrdered())
		{
			return -1;
		}
		else if (getTimeOrdered() > other.getTimeOrdered())
		{
			return 1;
		}
		else if (getTimeOrdered() == other.getTimeOrdered())
		{
			return 0;
		}
		return 0;
	}

}
