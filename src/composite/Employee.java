package composite;

import javax.naming.OperationNotSupportedException;

/**
 * 
 * @author Tinoudi
 * 
 *         Component
 */
public interface Employee {
	public void printName();

	public void add(Employee employee) throws OperationNotSupportedException;

	public void remove(Employee employee) throws OperationNotSupportedException;

	public Employee getEmployee(int i) throws OperationNotSupportedException;
}
