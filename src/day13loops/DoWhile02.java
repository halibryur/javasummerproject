package day13loops;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		/*
			 Ask user to enter his/her first name
			 If the initial is lower case print a message like "Make the initial upper case"
			 If the initial is upper case print a message like "You did it right"
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		char initial = '?';
		
		do {
			
			System.out.println("Enter your first name...");
			
			initial = scanner.next().charAt(0);
			
			if(initial>='a' && initial<='z') { // lowercase  harflerden birini verirse assagiya dogru olarak dusecek
				System.out.println("Make the initial upper case");
			}
					
		}while(initial>='a' && initial<='z');  //Merve yazdigimizda duzen kiriliyor M ascii gore lower caseden kucuk 
		// merve yazarsak tekkrar doner do ya ve Enter your first name cikar 
		//ACIKLAMA: buraya (ture) da yazilabiliyor yukaridaki sartin aynisini yazmaktansa bunu bi kac ders sonra gorceksin
		System.out.println("You did it right at the end...");

	}

}