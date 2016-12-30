package memento;

public class Client {

	public static void main(String[] args) {
		Originator originator = new Originator();
		CareTaker CT = new CareTaker();
		originator.setState(10, 20, 5);
		Memento mem = originator.saveToMemento();
		CT.addState(mem);
		System.out.println("original state : ");
		System.out.println(originator.toString());
		System.out.println("modify the state : ");
		originator.setState(100, 120, 7);
		mem = originator.saveToMemento();
		CT.addState(mem);
		System.out.println(originator.toString());
		originator.restoreStateFromMemento(mem);
		System.out.println("get the original state : ");
		System.out.println(originator.toString());
		
		CT.printAllSavedState();

	}

}