package day13loops;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		
		/*
			 Ask user to enter an integer
		     If the integer is even print on the console "You won!"
			 Otherwise ask user to enter another integer
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		int n = 0; // BASLANGIC SAYISI olustruyoruz ilk

		do {			
			System.out.println("Enter an integer");
			n = scanner.nextInt();	// ice yazdik icte yurumesi icin disari alirsak hata veriri
		}while(n%2!=0); // odd number cikarsa donmeye devam etsin diye burada kurali kirar cift sayi verince

		System.out.println("You won!...");
	}
}