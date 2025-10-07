/*******************************************************************
 *	This class is responsible for tracking products, managing
 *	sales, and offering products.
 *
 *******************************************************************/

package coffeeshop;
import java.util.ArrayList;

public class CoffeeShop {
	// Variables
	private String name;
	private double totalSales;
	private ArrayList<Product> offeredProducts;
	
	public CoffeeShop(String name) {
		this.name = name;
		this.totalSales = 0;
		this.offeredProducts = new ArrayList<>();
	}
	
	// getters
	
	public String getName() {
		return name;
	}
	
	public double getTotalSales() {
		return totalSales;
	}
	
	public ArrayList<Product> getOfferedProducts() {
		return offeredProducts;
	}
	
	public void addProduct(Product product) {
		// assign shop to product
		product.setShop(this);
		offeredProducts.add(product);
		System.out.println(product.getClass().getSimpleName() + " (ID: " + product.getId() + ") has been offered by " + name + ".");
	}
	
	public void recordSale(double amount) {
		totalSales += amount;
	}
	
	public void showDetails() {
		System.out.println("\n CoffeeShop: " + name);
		System.out.println("Total Sales: " + totalSales);
		System.out.println("Offered Products:");
		if (offeredProducts.isEmpty()) {
			System.out.println(" No products offered yet");
		} else {
			for (Product p : offeredProducts) {
				System.out.println(" " + p.displayInfo());
			}
		}
		
	}
}
