package memento;

import java.util.*;

public class CareTaker {

	private int counter;
	private Map mementoList = new HashMap();

	public CareTaker() {
		counter = 1;
	}

	public void addState(Memento m) {
		mementoList.put(counter, m);
		counter++;
	}

	public void removeState(int i) {
		mementoList.remove(i);
	}

	public Memento getState(int i) {
		return (Memento) mementoList.get(i);
	}

	public void printAllSavedState() {
		System.out.println("---------- Saved states-----------");
		for (int i = 1; i <= mementoList.size(); i++) {
			System.out.println(mementoList.get(i).toString());
		}
		System.out.println("----------------------------------");
	}
}
