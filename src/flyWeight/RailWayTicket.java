package flyWeight;

/**
 * 
 * @author Tinoudi
 *
 *         ConcreteFlyWeight
 */
public class RailWayTicket implements Ticket {
	private String type;
	private String name;
	private double fare;

	public RailWayTicket(String type) {
		this.type = type;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setFare(double fare) {
		this.fare = fare;
	}

	@Override
	public void printTicket() {
		System.out.println("--------TICKET--------");
		System.out.println("Name : " + name + "\nTicket Type : " + type + "\nFare : " + fare);
	}

}
