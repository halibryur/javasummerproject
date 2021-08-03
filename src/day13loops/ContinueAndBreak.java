package day13loops;

import java.util.Scanner;

public class ContinueAndBreak {

	public static void main(String[] args) {
		
		/*
		 	continue ==> is used to skip some values in a loop
		 	             if you execute "continue", it takes you to the "increment or decrement" part
		 	             
		 	break ==> is used to end the loop
		*/
		
		/*
		 	Print all integers from 1 to 11 except 7 and 9
		*/
		for(int i=1; i<12; i++) {
			if(i==7 || i==9) {
				continue; // yani gec atla bunlari demek
			}
			System.out.print(i + " ");			
		}
		
		/*
	 	     Ask user to enter integers and print it
	 	     Go on to ask user to enter integers until user enters 11
	    */
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			
			System.out.println("Enter an integer...");
			int n = scanner.nextInt();
			
			if(n==11) { // 10 yada atiyrum 11 disinda sayi olursa tekrra Enter an... der
				break; // 11 yasarsak en disa cikar switch kuralinda oldugu gibi
			}else {
				System.out.println(n + " "); // 10 yazmissak gelir buraya consol da 10 cikmasinin dizises println
			}
				
		}while(true); // (int i=1; i<12; i++) anlaminda kullandik 
		
		System.out.println("You stepped on the mine, you died...");

	}

}