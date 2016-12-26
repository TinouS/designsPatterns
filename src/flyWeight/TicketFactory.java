package flyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Tinoudi
 *
 *         FlyWeightFactory
 */
public class TicketFactory {

	private static Map<String, Ticket> ticketMap = new HashMap<String, Ticket>();

	public static Ticket getTicket(String type, String name, double fare) {

		Ticket ticket;
		if (ticketMap.containsKey(type)) {
			System.out.println("exist");
			ticket = ticketMap.get(type);
		} else {
			ticket = new RailWayTicket(type);
			ticketMap.put(type, ticket);
		}

		ticket.setName(name);
		ticket.setFare(fare);
		return ticket;
	}
}
