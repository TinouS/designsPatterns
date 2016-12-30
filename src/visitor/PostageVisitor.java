package visitor;

public class PostageVisitor implements Visitor {

	private double totalPostageForCart;
	private double priceOfFruit;

	@Override
	public void visit(Book book) {
		if (book.getPrice() < 10)
			totalPostageForCart += book.getWeight() * 2;
	}

	public double getTotalPostageForCart() {
		return totalPostageForCart;
	}

	@Override
	public void visit(Fruit fruit) {
		priceOfFruit +=fruit.getPrice()*fruit.getWeight();
	}

	public double getPriceOfFruit() {
		return priceOfFruit;
	}

}
