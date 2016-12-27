package decorator;

public class PizzaDecorator implements Pizza {
	private Pizza pizza;

	public PizzaDecorator(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public float getPrice() {
		return pizza.getPrice();
	}

	@Override
	public void preparePizza() {
		pizza.preparePizza();
	}

	@Override
	public void packPizza() {
		pizza.packPizza();
	}

}
