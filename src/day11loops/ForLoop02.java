package day11loops;

import java.util.Scanner;

public class ForLoop02 {

	public static void main(String[] args) {
		
		/*
		 	Type code to find the multiplication of the numbers from 1 to 10
		*/
		
		int prod = 1;	// ACIKLAMA: Degeri bir veriyoruz cunku carpanda eti etmeyen bir eleman	
		for(int i=1; i<11; i++) {			
			prod = prod * i;	// assign edyiruz birbirinine 	
			//System.out.println(prod); ACIKLAMA iceride yazarsak surekli print print print alt alta hesabin tek tek hepsini gosterir
		}		
		System.out.println(prod);
		
		/*
		 	Ask user to enter a number the calculate the factorial of it. // FACTORIAL 1 den itibaren verilen sayilari carpma islemi
		 	5! = 5*4*3*2*1 
		 	
		 	Note: 17! is greater than the maximum value of integer. Because of that if you use int as data type
		 	      in factorial codes you can calculate 16! at most.
		 	      
		 	      Java created another class for huge whole numbers, it is BigDecimal Class but we will learn it later.
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer to calculate its factorial...");
		int x = scanner.nextInt();
		
		int p = 1;
		
		if(x<0) {
			
			System.out.println("Do not use negative numbers for factorial...");// eksi deger sayi da kullanmiyoruz 
			
		}else {
		
			for(int i=x; i>0; i--) {
				p= p * i;
			}
			
			System.out.println(x + "!=" + p);
		}
	}

}