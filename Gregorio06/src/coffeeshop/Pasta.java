package coffeeshop;

public class Pasta extends Product {
	public Pasta() {
		super(150); // pasta price
	}
	
	@Override
	public String displayInfo() {
		return "Pasta - ID: " + id + ", Price: " + price;
	}
}
