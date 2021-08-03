package day12loops;

import java.util.Scanner;

public class WhileLoop03 {

	public static void main(String[] args) {
		
		/*
			 Type java code by using while loop, 
	         Write a program to count the factors of an integer which is entered by user.
	         Factors of 12 = 1, 2, 3, 4, 6, 12
	         Factors of 8  = 1, 2, 4, 8 // ACIKALAMA factor kalansiz bolunebirlik 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number...");
		int n = Math.abs(scanner.nextInt());
		
		int i = 1; // starting value her sayi 1 e bolundugu icin
		int counter = 0;//flag olusturduk container olarak 

		while(i<=n) { // n condition durumu user dan aldigimiz sayiya ulasinca durmasi icin
			if(n%i==0) {	// kalanin 0 olmasi lazim ki bolunenler ortaya ciksin
				counter++; // kac tane oratkbolen oldugunu cikariyor  run yaptiginda gorurusun
				System.out.print(i + " ");				
			}			
			i++; //loop yaptiriyor 
		}
		System.out.println();
		System.out.println("The number of positive factors: " + counter);
	}

}