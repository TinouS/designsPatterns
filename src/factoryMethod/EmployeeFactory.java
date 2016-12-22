package factoryMethod;

public class EmployeeFactory {

	public static Roles getRole(String type) {
		Roles role = null;
		if (type.equalsIgnoreCase("CEO")) {
			role = new CEORoles();
		} else if (type.equalsIgnoreCase("CFO")) {
			role = new CFORoles();
		} else if (type.equalsIgnoreCase("CTO")) {
			role = new CTORoles();
		}
		return role;
	}
}
