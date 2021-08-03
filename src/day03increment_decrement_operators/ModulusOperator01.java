package day03increment_decrement_operators;

import java.util.Scanner;

public class ModulusOperator01 {

	public static void main(String[] args) {
		
		/*
		 	Modulus operator(%) is used to find the reminder when you divide a number by the other.
		 	25:4 ==> The reminder will be 1.
		*/
		
		// System.out.println(25%4);//1
		
		//Get a number from user and print the last digit of the number on the console.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer...");
		int num = scanner.nextInt();
		
		//To get the last digit of an integer use %10, to get the last 2 digits of an integer use %100 etc....
		System.out.println("The last digit of your number: " + num%10);
		
		//Get 3 digits integer from user the return the sum of the digits of the number "HER SEFERINDE COZ"
		//257 ==> 2 + 5 + 7 = 14
		
		int number = 0;// user change edecegi icin ne rakam yazarsan yaz containerimizi olusturuyoruz
		int lastDigit = 0; 
		int midDigit = 0;
		int firstDigit = 0; 
		
		System.out.println("Give me a 3 digit integer...");
		number = scanner.nextInt(); 
		
		lastDigit = number%10;// kalani bulmak yani son rakam (257 icin) kalan 7
		number = number/10; // 25 yapmak icin number normalde 25,7 .. 7 duser 
		
		midDigit = number%10;// 5 yapmak icin 25 in son rakimini aldik
		number = number/10; // 2 yapmak icin number  2,5 normalde  .. 5 duser
		
		firstDigit = number%10;// 2 yi 2 ye bol kalan 2 son rakamimizii da aldik
		
		System.out.println(lastDigit + midDigit + firstDigit);

	}
}