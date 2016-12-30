package observer;

public class RedDress extends Observable {

	private String state = "indisponible";
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		notifyObservers();
	}
}
