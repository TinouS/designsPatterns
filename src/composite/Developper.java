package composite;

import javax.naming.OperationNotSupportedException;

/**
 * 
 * @author Tinoudi
 * 
 *         Leaf
 */
public class Developper implements Employee {
	private String name;

	public Developper(String name) {
		this.name = name;
	}

	@Override
	public void printName() {
		System.out.println(this.name);
	}

	@Override
	public void add(Employee employee) throws OperationNotSupportedException {
		throw new OperationNotSupportedException();
	}

	@Override
	public void remove(Employee employee) throws OperationNotSupportedException {
		throw new OperationNotSupportedException();
	}

	@Override
	public Employee getEmployee(int i) throws OperationNotSupportedException {
		throw new OperationNotSupportedException();
	}

}
