package bridge;

/**
 * 
 * @author Tinoudi Mohammed
 *
 * "Abstraction"
 */
public abstract class Flyable {

	protected Bird bird;
	
	public Flyable(Bird bird){
		this.bird = bird;
	}
	
	public abstract void tweet();
	public abstract void move(int x , int y);
}
