package day11loops;

import java.util.Scanner;

public class ForLoop04 {

	public static void main(String[] args) {
		/*
		 	Ask user to enter the length of the perpendicular side of an isoscles right triangle
		 	then create the triangle by using *
		 	Example: side length = 3
		 	         *
		 	         * *
		 	         * * *
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the side...");
		int len = scanner.nextInt();

		for(int i=1; i<=len; i++) { //ACIKLAMA 1 le basla alta gec 2 3 asagi yukari hareket
			for(int j=1; j<=i; j++) { // ACIKLAMA:Alt ve ust ayni islemi verecek formuller ayni gibi
			//Colum i dan baslayacak o yuzden i baz aliniyor	
				System.out.print("* ");
			}
			
			System.out.println();
			
		}

	}

} //ACIKLAMA: video 2:30 civarinda anlatiyor cizerek anlama tavsiye ediliyor bir yukardan bi asaagidan donguyle devam 
//eden bir dongo < ve > isl;emleri belirliuyor