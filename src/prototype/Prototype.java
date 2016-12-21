package prototype;

abstract class Prototype implements Cloneable{

	private String title;
	private double price;
	
	public Prototype clone() {
		
			Prototype p = null;
			try {
				p =  (Prototype) super.clone();
				p.setPrice(price);
				p.setTitle(title);
				
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
			return p;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Titre : "+this.getTitle()+", le prix "+this.getPrice();
	}

}
