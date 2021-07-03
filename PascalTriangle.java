/*Author: Nadezda Tsygankova
//ID: 152949194
 * Midterm 
 * 4.	Write a program that displays a Pascal triangle. 
 * The program prompts the user to enter the number of rows and displays the triangle. 
 * 
 * */

package Midterm;

import java.util.Scanner;

public class PascalTriangle {
	public static void main(String[] args) {
		   int number;//the number of rows 
			
			Scanner sc = new Scanner(System.in);
			do {
			System.out.println(" Enter the number of rows  : ");
			number =sc.nextInt() ;
		    }while(number <0);
			
			for (int i = 0; i < number; i++) {
				for (int j = 0; j < number-1; j++) {
					System.out.println(" ");
				}
			}
	}
 

}
