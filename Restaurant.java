/*//Author: Nadezda Tsygankova
//ID: 152949194
//Lab3-4-5 -Q2 part 2
 (Step-2) Create a class called Restaurant.
• Write a method addSale that takes customer name and purchase
amount of the customer in the class restaurant and stores it into an
array list.
• Write a method name BestCustomer that returns customer name who
bought highest sale in the restaurant.
• (Step-3) Write a tester class that prompts the user to enter name and
purchase of the customers and display the name of the customer who
bought highest sales in the restaurant. Import java.util.Scanner.
 * 
 * */
package labs;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Restaurant {
	private static Customer customerNew;
	private static ArrayList<Double> sales = new ArrayList<Double>();
	private static ArrayList<String> customers = new ArrayList<String>();

	// add customer in array sales and customers
	public void addSale(String nameF, double salesF) {
		boolean flag = true;
		try {
			customerNew = new Customer(nameF, salesF);
			flag = true;
		} catch (IllegalArgumentException ex2) {
//    		System.out.println(ex2);
			flag = false;
			throw new IllegalArgumentException("Purchase cannot be negative");

		}
		if (flag) {
			sales.add(customerNew.getPrice());
			customers.add(customerNew.getName());
		}

	}

	// function to find best customer to find max of sales and return name
	public String nameBestCustomer() {
		int max = 0;
		for (int i = 1; i < sales.size(); i++) {
			if (sales.get(max) < sales.get(i)) {
				max = i;
			}
		}
		return customers.get(max);
	}

	public static void main(String[] args) {
		Restaurant suchi = new Restaurant();
		Scanner sc = new Scanner(System.in);
		String name;
		double purchase = 0;
		int number = 1;
		boolean flag = true;
		boolean exit = true;
		boolean tr = true;
		do {
			flag = true;
			tr = true;
			// prompts the user to enter the name
			System.out.println("Enter your name:");
			name = sc.nextLine();
			// prompts the user to enter purchase of the customers
			do {
				do {
					System.out.println("Enter your purchase of the customer:");
					//catch input exception 
					try {
						purchase = sc.nextDouble();
						tr = false;
					} catch (InputMismatchException ex) {
						System.out.println("Try again");
						sc.nextLine();

					}
				} while (tr);
				// catch exceptions
				try {
					suchi.addSale(name, purchase);
					flag = false;
				} catch (IllegalArgumentException ex3) {
					System.out.println(ex3);
					sc.nextLine();
				}
			} while (flag);
			//if customer want to add additional customers
			System.out.println("Do you want add new customer:\n1.yes\n2.no");
			do {
				try {
					number = sc.nextInt();
				} catch (InputMismatchException ex) {
					System.out.println("Try again");
					sc.nextLine();
				}
				sc.nextLine();
				if (number == 2) {
					//for exit
					System.out.println("Thank you!");
					exit = false;
				} else if (number == 1) {
					System.out.println("Continue");
				} else {
					//check invalid input
					System.out.println("Invalid inpit");
				}
			} while (number != 1 && number != 2);
		} while (exit);
		//find a best customer
		String nameBest = suchi.nameBestCustomer();
		System.out.println("The best customer is " + nameBest);
		sc.close();
	}

}
