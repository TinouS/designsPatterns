package adapter;

public class ChessBoard implements Square{

	private int sideLenght;
	
	@Override
	public void setSide(int sideLenght) {
		this.sideLenght = sideLenght;
	}

	@Override
	public void printAreaOfSquare() {
		System.out.println("Area of chess board is "+sideLenght*sideLenght);
	}

}
