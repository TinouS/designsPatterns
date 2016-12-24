package bridge;
/**
 * 
 * @author Tinoudi Mohammed
 *
 * "ConcreteImplementor"
 */
public class Crow implements Bird {

	private int x;
	private int y;

	@Override
	public void makeSound() {
		System.out.println("Caw Caw !!");
	}

	@Override
	public void goToPosition(int x, int y) {
		System.out.println("Crow is moving to position " + x + " | " + y);
		this.x = x;
		this.y = y;
	}

}
