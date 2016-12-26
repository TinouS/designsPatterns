package adapter;
/**
 * 
 * @author Tinoudi
 *
 * Adapter
 */
public class RectangleAdapter implements Square{

	public Rectangle rectangle;
	
	
	public RectangleAdapter(Rectangle rectangle) {
		this.rectangle = rectangle;
	}
	
	@Override
	public void setSide(int sideLenght) {
		rectangle.setLenght(sideLenght);
		rectangle.setWidth(sideLenght);
	}

	@Override
	public void printAreaOfSquare() {
		rectangle.printAreaOfRectangle();
	}
	
	

}
