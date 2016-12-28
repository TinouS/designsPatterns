package composite;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.naming.OperationNotSupportedException;

public class Client {
	private static Logger log = Logger.getLogger("logger");

	public static void main(String args[]) {

		Employee emp1 = new Developper("Mick");
		Employee emp2 = new Developper("Jack");
		Employee emp3 = new Developper("Soufiane");

		Employee mng = new Manager("Simo");

		try {
			mng.add(emp1);
			mng.add(emp2);
			mng.add(emp3);
		} catch (OperationNotSupportedException e) {
			log.log(Level.INFO, e.getMessage());
		}
		mng.printName();
	}
}
