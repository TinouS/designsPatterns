package decorator;
/**
 * 
 * @author Tinoudi
 *
 * ConcreteComponent
 */
public class PlainPizza implements Pizza{

	@Override
	public float getPrice() {
		return 10;
	}

	@Override
	public void preparePizza() {
		System.out.println("Preparing Pizza ... ");
	}

	@Override
	public void packPizza() {
		System.out.println("Packing Pizza ! ");
	}

}
