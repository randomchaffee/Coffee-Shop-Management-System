/*******************************************************************
 *	This class handles customer ordering, discount application, and
 *	tracking what each customer buys	
 *
 *******************************************************************/

package people;
import java.util.ArrayList;

//from coffeeshop package
import coffeeshop.Coffee;
import coffeeshop.Pasta;
import coffeeshop.Product; 

public class Customer {
	// variables
	private String name;
	private double cash;
	private ArrayList<Product> orderedProducts;
	
	// Constructor
	public Customer(String name) {
		this.name = name;
		this.cash = 1000; // initial cash
		this.orderedProducts = new ArrayList<>();
	}
	
	// getters
	public String getName() {
		return name;
	}
	
	public double getCash() {
		return cash;
	}
	
	public ArrayList<Product> getOrderedProducts() {
		return orderedProducts;
	}
	
	// ordering logic
	public void orderProduct(Product product) {
		// if product is taken
		if (product.isTaken()) {
			System.out.println(name + " cannot order " + product.getClass().getSimpleName() + 
					" (ID " + product.getId() + ") - already taken.");
			return;
		}
		
		// if product is offered
		if (product.getShop() == null) {
			System.out.println(name + " cannot order this product - product not offered.");
		}
		
		// get final price (discount if coffee)
		double priceToPay = product.getPrice();
		if (product instanceof Coffee) {
			priceToPay = ((Coffee) product).getFinalPrice();
		}
		
		// check if cash enough
		if (cash < priceToPay) {
			System.out.println(name + " does not have enough cash.");
			return;
		}
		
		// mark product as taken
		product.setTaken(true);
		cash -= priceToPay;
		orderedProducts.add(product);
		
		// add to sale in coffee shop
		product.getShop().recordSale(priceToPay);
		
		System.out.println(name + " successfully ordered " + product.getClass().getSimpleName() + 
				" (ID: " + product.getId() + ") for " + priceToPay + " pesos.");
	}
	
	// 5% discount (combo) when pasta + coffee
	public void applyComboDiscount() {
		boolean hasCoffee = false;
		boolean hasPasta = false;
		
		for (Product p : orderedProducts) {
			if (p instanceof Coffee) {
				hasCoffee = true;
			}
			if (p instanceof Pasta) {
				hasPasta = true;
			}
		}
		
		if (hasCoffee && hasPasta) {
			for (Product p : orderedProducts) {
				if (p instanceof Coffee) {
					((Coffee) p).setDiscount(0.05); // make discount 5%
				}
			}
			System.out.println(name + " increased discount to 5%!");
		}
	}
	
	public void showDetails() {
		System.out.println("\nCustomer: " + name);
		System.out.println("Remaining Cash: " + cash);
		System.out.println("Ordered Products:");
		if (orderedProducts.isEmpty()) {
			System.out.println(" None");
		} else {
			for (Product p : orderedProducts) {
				System.out.println(" " + p.toString());
			}
		}
	}
}
