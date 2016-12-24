package bridge;

public class Main {
	public static void main(String args []){
		Flyable flyable = new FlyingCaractere(5, 8, new Crow());
		flyable.move(6, 10);
		flyable.tweet();
	}

}
