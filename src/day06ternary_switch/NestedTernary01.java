package day06ternary_switch;

import java.util.Scanner;

public class NestedTernary01 {

	public static void main(String[] args) {
		
		/*
		 	Type java code by using nested ternary.
			Write a program to check if a year is leap year or not.
			If the year is divisible by 100 then it must be divisible by 400.
			If a year is not divisible by 100 then it must be divisible by 4.
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a year...");
		int year = scanner.nextInt();

	

	String result = (year%100==0 ? (year%400==0 ? "Leap year" : "Not Leap year") : (year%4==0 ? "Leap year" : "Not Leap year"));

		 
		 System.out.println(result);
	}
}
 // (CONDITION ? ~ (Condition ? Code1 : Code2) ~ : ~ (Condition ? Code1 : Code2)); ACIKLAMA: Condition "?", cod aralarina da ":" gelir.
//CONDITION condition cod cod condition cod cod :)))
