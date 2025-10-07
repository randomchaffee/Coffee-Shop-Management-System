/*******************************************************************
 *	This class handles the Products the CoffeeShop class can offer	
 *
 *******************************************************************/

package coffeeshop;

public abstract class Product {
	// Variables
	private static int newId = 1; // id
	protected int id;
	protected double price;
	protected CoffeeShop shop;
	private boolean taken;
	
	// Constructor
	public Product(double price) {
		this.id = newId++;
		this.price = price;
		this.taken = false;
	}
	
	//Getters
	public int getId() {
		return id;
	}
	
	public double getPrice() {
		return price;
	}
	
	public CoffeeShop getShop() {
		return shop;
	}
	
	// Setters
	public void setShop(CoffeeShop shop) {
		this.shop = shop;
	}
	
	public boolean isTaken() {
		return taken;
	}
	
	public void setTaken(boolean taken) {
		this.taken = taken;
	}
	
	public String displayInfo() {
		return "Product ID: " + id + ", Price " + price;
	}
}
