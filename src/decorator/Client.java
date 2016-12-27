package decorator;

public class Client {
	public static void main(String args[]) {
		Pizza cheeseBurstPizza = new CheeseBurstPizza(new DrinkGift(new PlainPizza()));
		cheeseBurstPizza.preparePizza();
		cheeseBurstPizza.packPizza();
		System.out.println(cheeseBurstPizza.getPrice());
	}
}
