package Assignment2;


public class DiamonShape {

	public static void main(String[] args) {
	//	printAsterisk();
		int num =9;
        for (int i = 1; i < num/2; ++i){ 
 
            for (int j = num/2; j > i; --j)
                System.out.print(" ");
 
            for (int j = 1; j < 2 * i; ++j)
                System.out.print("*");
 
            System.out.println();
        }
        for (int i = num/2; i >= 1; --i){ 
 
            for (int j = num/2; j > i; --j)
                System.out.print(" ");
 
            for (int j = 1; j < i*2; ++j)
                System.out.print("*");
 
            System.out.println();
        }
		
		
	}
	
	
	public static void printAsterisk() {
		int numberOfRow = 5;
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
