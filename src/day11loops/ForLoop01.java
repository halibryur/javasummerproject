package day11loops;

import java.util.Scanner;

public class ForLoop01 {

	public static void main(String[] args) {
		
		/*
		 	Type program to find the sum of the integers from 1 to 100
		*/
		int sum = 0; // 0 veriyoruz cunku toplamayi etki eden bir sayi degil
		for(int i=1; i<101;i++) {
			sum = sum + i;		
			
			// System.out.println("sum: " + sum); // ACIKLAMA bunu iceri yazarsak alt alta 1 3 6 10 15 21 28 36 45 ....5050 varciya kadar devam eder.
			//If you want to see sum value for every loop, put System.out.println("sum: " + sum); inside the loop body	
		}		
		//If you want to see just the final sum, put System.out.println("sum: " + sum); outside the loop body
		System.out.println("sum: " + sum);
		
		
		/*
		 	Ask user to enter starting and ending value, then find the sum of all integers from the starting to the ending value.
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter starting value...");
		int x = scanner.nextInt();
		System.out.println("Enter ending value...");
		int y = scanner.nextInt();
		
		int s = 0;
		
		if(x>y) { // - eksi deger yada sira siraszini bozan sayi verirse kullanici hata cikmamasi icin orn 1...4 olur ama 4...1 verirse 
			//geri olmaz 
			
			System.err.println("Starting value should be greater than ending value");
			
		}else {
		
			for(int i=x; i<y+1; i++) {
				s = s + i;
			}
			
			System.out.println("Sum from user: " + s);
			
		}

	}

}