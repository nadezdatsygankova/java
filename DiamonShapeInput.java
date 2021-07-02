package Assignment2;

import java.util.Scanner;

public class DiamonShapeInput {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
	
	int num = 0;
	int number=0;
	do {
	System.out.println("Enter odd number in the range 1 to 19: ");
	num = scanner.nextInt();
	if(num%2 !=0)
	{
		number = num;
	}
	else {
		System.out.println("Invalid input");
	}
	}while(num%2 ==0 || num<1 || num >19);
	
	printAsterisk(number);
	
	
}
public static void printAsterisk(int numberOfRow) {

	for (int i = 0; i <= numberOfRow; i++) {
		for (int j = 1; j <= numberOfRow-i; j++) {
			System.out.print(" ");				
		}
		for (int j = 1; j <= 2*i-1; j++) {
			System.out.print("*");
		}
		System.out.println("");
			
	}
	
	for (int i = numberOfRow-1; i >=1; i--) {
		for (int j = 1; j <= numberOfRow -i; j++) {
			System.out.print(" ");
		}
		for (int j = 1; j <= 2*i-1; j++) {
			System.out.print("*");
		}
		System.out.println("");
	}
}
}
