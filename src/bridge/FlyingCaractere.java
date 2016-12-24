package bridge;

/**
 * 
 * @author Tinoudi Mohammed
 *
 *         "RefinedAbstraction"
 */
public class FlyingCaractere extends Flyable {

	private int x;
	private int y;

	public FlyingCaractere(int x, int y, Bird bird) {
		super(bird);
		this.x = x;
		this.y = y;
	}

	@Override
	public void tweet() {
		bird.makeSound();
	}

	@Override
	public void move(int x, int y) {
		bird.goToPosition(x, y);
	}

}
