package chainOfResponsibility;

public class Dollar10Dispenser implements DispenseChain {

	private DispenseChain dispenseChain;

	@Override
	public void setNextChain(DispenseChain dispenseChain) {
		this.dispenseChain = dispenseChain;
	}

	@Override
	public void dispense(Currency currency) {
		try {
			if (currency.getAmount() >= 10) {
				int num = currency.getAmount() / 20;
				int remainder = currency.getAmount() % 20;
				System.out.println("Dispensing " + num + " 10$ note");
				if (remainder != 0)
					this.dispenseChain.dispense(new Currency(remainder));
			} else {
				this.dispenseChain.dispense(currency);
			}
		} catch (Exception e) {
			System.out.println("Should be in multiple of 10s !! ");
		}

	}

}
