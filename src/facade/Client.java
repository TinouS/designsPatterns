package facade;

public class Client {
	public static void main(String args[]) {
		OrderManagmentFacade orderManagmentFacade = new OrderManagmentFacade();
		orderManagmentFacade.placeOrder();
		System.out.println("\n");
		orderManagmentFacade.cancelOrder();
	}
}
