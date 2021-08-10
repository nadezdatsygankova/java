/*//Author: Nadezda Tsygankova
//ID: 152949194
//Lab3-4-5 -Q2 part 1
 * Create a class called Customer.
• (step1) Add a constructor of the class Customer that takes the name and
purchase amount of the customer as inputs.
• Write getter methods getName and getPrice to return the name and price of
the customer. You can write a toString() method which returns printed
string of Customer name and its purchase.
 * 
 * */

package labs;

public class Customer {
	//name and price
	private String name;
	  private double price;
	  public String getName() {
	    return name;
	  }
	  public void setName(String name) {
	    this.name = name;
	  }
	  public double getPrice() {
	    return price;
	  }
	  //exception for negative price
	  public void setPrice(double price) throws IllegalArgumentException{
		  if (price >= 0)
			  this.price = price;
			else
				throw new IllegalArgumentException("Price cannot be negative");

	  }
	  public Customer(String name, double price) {
	    super();
	    this.name = name;
	    //check for negative value
	    if (price >= 0)
			  this.price = price;
			else
				throw new IllegalArgumentException("Price cannot be negative");
	  }
	  @Override
	  public String toString() {
	    return "Customer [name=" + name + ", price=" + price + "]";
	  }
}
