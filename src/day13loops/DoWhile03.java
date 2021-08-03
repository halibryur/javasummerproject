package day13loops;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		
		/*
			 Ask user to enter password.
			 If the password has more than 6 characters print "Password is valid..."
			 Otherwise, print "Make the password longer than 6 characters" and ask user to enter a new password
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		String pwd = "";
		
		do {
			
			System.out.println("Enter your password...");
			
			pwd = scanner.nextLine(); // scanner dan data mizi almayi unutmuyoruz
			
			if(pwd.length()<=6) { // tuturmadiginda assagidakini versin diye 
				
				System.out.println("Make the password has more than 6 characters!");
				
			}
			
			
		}while(pwd.length()<=6); // olasi password u tuturdugunda donguye son vermesi icin
		
		System.out.println("Password is valid...");

	}

}