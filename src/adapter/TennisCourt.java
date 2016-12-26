package adapter;

public class TennisCourt implements Rectangle {

	private int lenght, width;

	@Override
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	@Override
	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public void printAreaOfRectangle() {
		System.out.println("Area of tennis court is " + width * lenght);
	}

}
