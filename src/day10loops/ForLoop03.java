package day10loops;

import java.util.Scanner;

public class ForLoop03 {

	public static void main(String[] args) {
		/*
			 Ask user to enter a String
			 Check if t he String is Palindrome or not
			 anna <==> anna
			 1223221 <==> 1223221
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String...");
		String s = scanner.nextLine();
		
		String reversed = ""; //kapali kalacak mutlaka
		
		//Reverse String s

		for(int i=s.length()-1; i>=0;i--) { // ACIKLAMA Unutma s.length()-1 her zaman last index i verir ezberle
			reversed = reversed + s.charAt(i);			
		}
		
		if(s.equalsIgnoreCase(reversed)) {
			System.out.println(s + " is palindrome");
		}else {
			System.out.println(s + " is not palindrome");
		}

	}

}