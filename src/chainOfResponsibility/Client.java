package chainOfResponsibility;

public class Client {

	public static void main(String[] args) {
		DispenseChain c1, c2, c3;
		c1 = new Dollar50Dispenser();
		c2 = new Dollar20Dispenser();
		c3 = new Dollar10Dispenser();

		// set the chain of responsibility
		c1.setNextChain(c2);
		c2.setNextChain(c3);

		c1.dispense(new Currency(300));

	}

}
