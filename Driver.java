

public class Driver {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Restaurant resQueue = new QueueRestaurant(10);
		Restaurant resStack = new StackRestaurant();
		
		Ticket ticket1 = new Ticket("Grilled cheese", 10);
		Ticket ticket2 = new Ticket("Spaghetti", 20);
		Ticket ticket3 = new Ticket("Surf and Turf", 25);
		Ticket ticket4 = new Ticket("Popcorn Chicken", 30);
		resQueue.addTicket(ticket1);
		resQueue.addTicket(ticket2);
		resQueue.addTicket(ticket3);
		resQueue.addTicket(ticket4);
		
		System.out.println(resQueue.numberRemainingTickets());
		System.out.println(resQueue.checkNextCompletedTicket());
		System.out.println(resQueue.completeTicket(30));
		System.out.println(resQueue.completeTicket());
		
		resStack.addTicket(ticket1);
		resStack.addTicket(ticket2);
		resStack.addTicket(ticket3);
		resStack.addTicket(ticket4);
		
		System.out.println(resStack.numberRemainingTickets());
		System.out.println(resStack.checkNextCompletedTicket());
		System.out.println(resStack.completeTicket(45));
		System.out.println(resStack.completeTicket());
		
		

	}

}
