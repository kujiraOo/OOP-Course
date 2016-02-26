/**
 * A program which finds the total price of all products from the 
 * following text. The price for each product is calculated by multiplying 
 * the amount of the product by its unit price
 */

package assignment5;


public class TotalPrice {

	public static void main(String[] args) {

		double totalPrice = 0.0; // Hold total price
		
		// Initial data
		String data = "name=Milk;amount=200;unit_price=0.9\nname=Bread;amount=134;unit_price=3.48\nname=Butter;amount=58;unit_price=1.65\nname=Cheese;amount=260;unit_price=4.35";
		
		// Get array of substrings using new line regex
		// Each substring represents a product
		String[] products = data.split("\n");
		
		for (int i = 0; i < products.length; i++) {
			
			// Get arrays of key-value pairs of product
			// key-value pairs velloe are corresponding to indices of
			// the arrays as following:
			// 0 - name
			// 1 - amount
			// 2 - unit price
			String[] prd = products[i].split(";");
			
			// Get each key-value pair and split it using "=" regex
			// In resulting array of substrings, substring under
			// index 1 represents the value from corresponding
			// key-value pair
			String name = prd[0].split("=")[1];
			int amount = Integer.parseInt(prd[1].split("=")[1]);
			double unitPrice = Double.parseDouble(prd[2].split("=")[1]);
			
			System.out.println("Amount of " + name + ": " + amount + ", price for one unit: " + unitPrice);
			
			totalPrice += amount * unitPrice;
		}
		
		System.out.println("Total price is " + totalPrice);
	}

}
