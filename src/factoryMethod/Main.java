package factoryMethod;

public class Main {

	public static void main(String[] args) {

		try {
			System.out.println(EmployeeFactory.getRole("ceo").getRole());
		} catch (NullPointerException e) {
			System.out.println("No such Role is found");
		}

	}
}
