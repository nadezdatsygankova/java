/*Author: Nadezda Tsygankova
//ID: 152949194
 * Midterm 
 * 2.	Write a program that prompts the user to enter a positive integer and obtains its square root in simplest form. 
 * For example, the simplest form for  is 3 is, for  is 2, and for 3is 18. Here are some sample runs:
 * 
 * */


package Midterm;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
		
    	
        int number;//variable for  positive integer
		
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println(" Enter a positive integer : ");
		number =sc.nextInt() ;
        }while(number <0);
		
		System.out.println("sqrl(" + number + ") is 10 * sqrl(" + Math.sqrt(number) + ") " );
		
	}
    

	
	
}
