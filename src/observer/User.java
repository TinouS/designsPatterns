package observer;

public class User implements Observer {

	private String name;

	public User(String name) {
		this.name = name;
	}

	@Override
	public void update(Observable o) {
		System.out.println(name+" is notified : ");
		System.out.println("The state of RedDress : " + ((RedDress) o).getState());
	}

}
