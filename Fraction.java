/*Author: Nadezda Tsygankova
//ID: 152949194
 * Midterm 
 * 1.1.	 Write a program that prompts the user to enter the numerator and denominator of a fraction. 
 * The program determines whether the number is a proper fraction or an improper fraction. 
 * If it is a proper fraction, display the number. 
 * If not, reduce it to a mixed fraction or to an integer. Here are sample runs:
 * */

package Midterm;

import java.util.Scanner;

public class Fraction {

	public static void main(String[] args) {
		int numerator; //variable for numerator
		int denominator;//variable for denominator
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a numerator: ");
		numerator =sc.nextInt() ;
		System.out.println("Enter a denominator: ");
		denominator =sc.nextInt() ;
		fractionType(numerator,denominator);
		
		
	}
	
	//function for calculate fraction type
	public static void fractionType(int numerator, int denominator) {
		//check what number is less
		if(numerator <denominator)
		{
			//proper fraction
			System.out.println(numerator +"/" + denominator +" is a proper fraction " );
		}
		else {
			//improper fraction
			if(numerator%denominator == 0) {
				System.out.println(numerator +"/" + denominator + " is an improper fraction and can be reduced to " + numerator/denominator );
			}
			else {
				//converting to a mixed number
				int division = (numerator/denominator);
				int modul = numerator%denominator;
				
				System.out.println(numerator +"/" + denominator + " is an improper fraction and its mixed fraction is " + division +" + " + modul +"/" + denominator);
			}
		}
		
	}
	

	
	
}
