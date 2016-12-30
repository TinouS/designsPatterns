package observer;

public class Client {

	public static void main(String args[]) {
			
		Observable observable  = new RedDress();
		observable.attach(new User("Jack"));
		observable.attach(new User("Soufiane"));
		observable.attach(new User("Taylor"));
		observable.attach(new User("Bouch"));
		
		((RedDress)observable).setState("disponible");
		
	}

}
