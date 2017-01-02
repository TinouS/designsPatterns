package chainOfResponsibility;

public class Dollar50Dispenser implements DispenseChain {

	private DispenseChain DispenseChain;

	@Override
	public void setNextChain(DispenseChain nextDispenseChain) {
		this.DispenseChain = nextDispenseChain;
	}

	@Override
	public void dispense(Currency currency) {
		if (currency.getAmount() >= 50) {
			int num = currency.getAmount() / 50;
			int remainder = currency.getAmount() % 50;
			System.out.println("Dispensing " + num + " 50$ note");
			if (remainder != 0)
				this.DispenseChain.dispense(new Currency(remainder));
		} else {
			this.DispenseChain.dispense(currency);
		}
	}

}
