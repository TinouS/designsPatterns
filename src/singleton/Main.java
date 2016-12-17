package singleton;

public class Main {
	
	public static void main(String args []){
		Singleton s0 = Singleton.getInstance();
		Singleton s1 = Singleton.getInstance(); // <----- don't get the instance. 
	}

}
