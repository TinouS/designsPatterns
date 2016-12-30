package visitor;

public class client {

	public static void main(String args[]) {

		Visitor visitor = new PostageVisitor();
		Element book = new Book(2, 4);
		book.accept(visitor);
		System.out.println(((PostageVisitor) visitor).getTotalPostageForCart());
		System.out.println("-------------------------------------------------");
		Element fruit = new Fruit(2.5, 3);
		fruit.accept(visitor);
		System.out.println(((PostageVisitor) visitor).getPriceOfFruit());

	}

}
