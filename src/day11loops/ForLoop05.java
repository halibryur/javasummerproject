package day11loops;

import java.util.Scanner;

public class ForLoop05 {

	public static void main(String[] args) {
		
		/*
		 	Create the following image by getting the number of rows from user
		 				 .
		                 .
	0 space     * * * *   4 asterix
	1 space	     * * *    3 asterix
	2 space	      * *     2 asterix
	3 space	       *      1 asterix
	
	bastaki bosluklar ve asterix sayilari icin iki tane inner loop ve bunlar icin outer loop toplam 3 loop olacakX
	    */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the base...");
		int len = scanner.nextInt();
		for(int i=len; i>0; i--) { // outer loop Length icin azalarak gidecek
			
			
			for(int j=0; j<len-i; j++) { // for spaces 	space bir bir artarak gidecek	
				
				System.out.print(" ");		//bos yapacak	
			}
			for(int k=len; k>len-i; k--) {	// for asterixes	azalaral gidecek
				
				System.out.print("* ");	 // azalarak bir boslukla yaz "println" degil!			
			}			
			System.out.println();	// disa cilek ciktisi vermesi icin 		
		}

	}

}