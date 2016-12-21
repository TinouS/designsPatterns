package prototype;

public class Main {

	public static void main(String[] args) {
		
		Registry registry = new Registry();
		Book book1 = (Book) registry.createBasicProto("book");
		book1.setPrice(80);
		System.out.println(book1.toString());
		
	}

}
