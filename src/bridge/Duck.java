package bridge;
/**
 * 
 * @author Tinoudi Mohammed
 *
 * "ConcreteImplementor"
 */
public class Duck implements Bird{
	
	private int x;
	private int y;

	@Override
	public void makeSound() {
		System.out.println("Qwak Qwak !! ");
	}

	@Override
	public void goToPosition(int x, int y) {
		System.out.println("Duck is moving to position " + x + " | " + y);
		this.x = x;
		this.y = y;
	}

}
