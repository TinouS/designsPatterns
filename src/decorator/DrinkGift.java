package decorator;

public class DrinkGift extends PizzaDecorator {

	public DrinkGift(Pizza pizza) {
		super(pizza);
	}

	@Override
	public float getPrice() {
		return super.getPrice();
	}

	@Override
	public void preparePizza() {
		System.out.println("Give a drink with this pizza");
		super.preparePizza();
	}

	@Override
	public void packPizza() {
		System.out.println("Pack the drink with this pizza");
		super.packPizza();
	}

}
