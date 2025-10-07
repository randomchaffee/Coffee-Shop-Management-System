package coffeeshop;

public class Tea extends Product {
	public Tea() {
		super(150); // tea price
	}
	
	@Override
	public String displayInfo() {
		return "Tea - ID: " + id + ", Price: " + price;
	}
}
