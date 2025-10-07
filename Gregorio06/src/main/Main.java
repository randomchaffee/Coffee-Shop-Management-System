/*********************************************************************
 *	This program demonstrates the principles of polymorphism and uses
 *	generic data structures.
 *
 *	
 * @author Evan C. Gregorio
 * @date_created 02/10/2025 13:43
 * 
 *********************************************************************/

package main;
import coffeeshop.*;
import people.*;

public class Main {
	public static void main(String[] args) {
		
		// Customers
		Customer von = new Customer("Von");
		von.showDetails();
		Customer adolf = new Customer("Adolf");
		adolf.showDetails();
		
		// Coffee Shop
		CoffeeShop starbucks = new CoffeeShop("Starbucks Sto. Tomas Lifestyle Strip");
		starbucks.showDetails();
		
		// Coffee
		Coffee coffee1 = new Coffee();
		Coffee coffee2 = new Coffee();
		Coffee coffee3 = new Coffee();
		Coffee coffee4 = new Coffee();
		
		// pasta
		Pasta pasta1 = new Pasta();
		Pasta pasta2 = new Pasta();
		Pasta pasta3 = new Pasta();
		Pasta pasta4 = new Pasta();

		// tea
		Tea tea1 = new Tea();
		Tea tea2 = new Tea();
		Tea tea3 = new Tea();
		Tea tea4 = new Tea();
		
		// ---------
		
		starbucks.addProduct(coffee1);
		starbucks.addProduct(coffee2);
		starbucks.addProduct(coffee3);
		starbucks.addProduct(coffee4);
		starbucks.addProduct(pasta1);
		starbucks.addProduct(pasta2);
		starbucks.addProduct(pasta3);
		starbucks.addProduct(pasta4);
		starbucks.addProduct(tea1);
		starbucks.addProduct(tea2);
		starbucks.addProduct(tea3);
		starbucks.addProduct(tea4);
		
		von.orderProduct(coffee1);
		von.orderProduct(coffee2);
		von.orderProduct(pasta1);
		von.orderProduct(pasta2);
		von.orderProduct(coffee3);
		von.orderProduct(pasta3);
		von.orderProduct(tea1);
		von.orderProduct(pasta4);
		
		adolf.orderProduct(coffee1);
		adolf.orderProduct(coffee4);
		
		von.showDetails();
		adolf.showDetails();
		starbucks.showDetails();
	}
}
