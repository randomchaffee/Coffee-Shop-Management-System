package coffeeshop;

public class Coffee extends Product implements Discount{
	private double discountRate;
	
	public Coffee() {
		super(100); // coffee price
		this.discountRate = 0.03; // 3% discount
	}
	
	// methods
	@Override
	public void setDiscount(double discountRate) {
		this.discountRate = discountRate;
	}
	
	public double getDiscountRate() {
		return discountRate;
	}
	
	public double getFinalPrice() {
		return price - (price * discountRate);
	}
	
	@Override
	public String displayInfo() {
		return "Coffee - ID: " + id + ", Price: " + price + ", Discount: " + (discountRate * 100) + "%";
	}
}
