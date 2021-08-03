package day05nestedif;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		/*
		 	Ask user to enter a 4 digit integer, then print the sum of the first 
			and the last digits of the number on the console.
			For example; if user enters 1234 you will add 1 and 4, then print on the console 5 
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a four digit integer...");
		int num = scanner.nextInt(); // Bu uclu yapiyla user dan data almak icin kullaniriz.

		num = Math.abs(num); // Java created math for making easy 48:16 dak var - verilen sayialri duzeltmesi icin 
		if(num>999 && num<10000) {
			
			int first = num / 1000;
			int last = num % 10;
			
			System.out.println("The sum is " + (first + last));// ACIKLAMA toplamada parantez kullaniliyor
						
		}else {
			System.out.println("I told you to enter 4 digit integer...");
		}

		scanner.close();
	}
}

