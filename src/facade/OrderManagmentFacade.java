package facade;

public class OrderManagmentFacade {
	private ReserveInventory reserveInventory;
	private ReservePayment reservePayment;
	private DeleverySystem deleverySystem;
	private CancelOrder cancelOrder;
	private RefundPayment refundPayment;

	public OrderManagmentFacade() {
		reserveInventory = new ReserveInventory();
		reservePayment = new ReservePayment();
		deleverySystem = new DeleverySystem();
		cancelOrder = new CancelOrder();
		refundPayment = new RefundPayment();
	}

	public void placeOrder() {
		reserveInventory.ReserveInventory();
		reservePayment.receivePayment();
		deleverySystem.delecryOrder();
	}

	public void cancelOrder() {
		cancelOrder.cancelOrder();
		refundPayment.refundOrderAmount();
	}

}
