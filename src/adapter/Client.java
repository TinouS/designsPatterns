package adapter;

public class Client {

	public static void main(String[] args) {
		
		Rectangle rectangle = new TennisCourt();
		Square square = new RectangleAdapter(rectangle);
		
		rectangle.setLenght(5);
		rectangle.setWidth(4);
		rectangle.printAreaOfRectangle();
		
		square.setSide(5);
		square.printAreaOfSquare();
	}

}
