package day06ternary_switch;

import java.util.Scanner;

public class Ternary04 {

	public static void main(String[] args) {
		/*
		 	Ask user to enter an integer. 
		 	If the number has 3 digits, output will be “This number has 3 digits.” 
		 	Otherwise, output will be “This number has no 3 digits.”
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer...");
		int a = scanner.nextInt();
		int b = Math.abs(a); //  Returns the mathematical absolute value of an {@code int} value 
//ACIKLAMA: Diger degerler i de bulabilmek icin -999 gibi Math.abs kullanildi ve "b" le$tirdik
		 //  a>99 && a<=999 yazdik fakat -999 a 3 digit demeyor.. :))    
		String result = b<1000 && b>99 ? a  + " has 3 digits" : a + " has no 3 digits";
		System.out.println(result);
	}

} 