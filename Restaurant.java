package labs;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant {
    private static Customer customerNew;
    private static ArrayList<Double> sales = new ArrayList<Double>();
    private static ArrayList<String> customers =new ArrayList<String>();
   
    public void addSale( String nameF, double salesF) {
    	customerNew = new Customer(nameF, salesF);
    	sales.add(customerNew.getPrice());
    	customers.add(customerNew.getName());
    }
	
	public  String nameOfBestCustomer()
	{
	int max = 0;
	for(int i = 1; i < sales.size(); i++)
	{
	if(sales.get(max) < sales.get(i))
	{
	max = i;
	}
	}
	return customers.get(max);
	}
	
	public static void main(String[] args) {
		    Restaurant suchi= new Restaurant();
		    Scanner sc = new Scanner(System.in);
		    String name;
		    double purchase = 0;
		    int number =1;
		    do {
		    //prompts the user to enter the name
		    System.out.println("Enter your name:");
		    name = sc.nextLine();	 
		    //prompts the user to enter purchase of the customers
		    System.out.println("Enter your purchase of the customer:");
		    purchase = sc.nextDouble();    
		    suchi.addSale(name, purchase);
		    System.out.println("Do you want add new customer:\n1.yes\n2.no");
		    number = sc.nextInt();
		    sc.nextLine();
		    if(number ==2) {
		    	System.out.println("Thank you!");
		    }   
		    }while (number == 1);
		    String nameBest = suchi.nameOfBestCustomer();
		    System.out.println("The best customer is "+ nameBest);
		    sc.close();
	}
	
}

