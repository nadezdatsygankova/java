package Assignment2;

import java.util.Scanner;

public class DuplicateElimination {
public static void main(String[] args) {
	int [] array = new int[5];
	boolean res = false;
	
	Scanner scanner = new Scanner(System.in);
	int num = 0;
	System.out.println("Enter five numbers each between 10 and 100: ");

	
	for (int i = 0; i < array.length; i++) {
		do {
			res = false;
		
		num= scanner.nextInt();
		
		if( num<10 || num >100) {
			System.out.println("wrong number");
		}
		else {
			for (int j = 0; j < array.length; j++) {
				if(num == array[j] )
				{
					res = true;		
				}
					
			}
			if(!res) {
				array[i] =num;
			}
				

			
			for (int j = 0; j < array.length; j++) {
				if(array[j]>0) {
					System.out.print(array[j] +" ");
				}
			}
			System.out.println();		
		}
				
		}while( num<10 || num >100);
	}
	
}
		
}
