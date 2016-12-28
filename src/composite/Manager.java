package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Tinoudi
 * 
 *         Composite
 */
public class Manager implements Employee {
	private String name;
	private List<Employee> employees = new ArrayList<Employee>();

	public Manager(String name) {
		this.name = name;
	}
	
	@Override
	public void printName() {
		System.out.println("Manager name : " + name);
		System.out.println("Developpers names : \n");
		employees.forEach(emp -> emp.printName());
	}

	@Override
	public void add(Employee employee) {
		employees.add(employee);
	}

	@Override
	public void remove(Employee employee) {
		employees.remove(employee);
	}

	@Override
	public Employee getEmployee(int i) {
		return employees.get(i);
	}

}
