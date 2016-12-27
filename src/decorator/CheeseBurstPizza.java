package decorator;

public class CheeseBurstPizza extends PizzaDecorator {

	public CheeseBurstPizza(Pizza pizza) {
		super(pizza);
	}
	
	@Override
	public float getPrice() {
		return super.getPrice() + 5.0f;
	}

	@Override
	public void preparePizza() {
		System.out.println("Adding extra cheese ... ");
		super.preparePizza();
	}

	@Override
	public void packPizza() {
		super.packPizza();
	}

}
