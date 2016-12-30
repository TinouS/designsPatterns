package visitor;

public class Book implements Element {

	private double price;
	private double weight;

	public Book(double price, double weight) {
		this.price = price;
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public double getWeight() {
		return weight;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
