package day12loops;

import java.util.Scanner;

public class WhileLoop02 {

	public static void main(String[] args) {
		
		/*
			 Type java code by using while loop, 
	         Write a program that prompts the user to input an integer. 
	         It should then find sum of the digits of that number. 
	         	123 ==> 1+2+3 = 6
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number...");
		int n = Math.abs(scanner.nextInt());// eksi giris yaptarsa kullanici  diye absolute kullaniyoruz sonuc eksi olark cikmamamsi icin
		
		int sum = 0;

		while(n!=0) { // sartimizi koyuyoruz sifirda durmasi icin sifir esit degildir sifira oldugunda kesiliyor
			sum = sum + n%10; //tek tek sayilir almamiz icin uygulalnan method bu bak day12 723 10 bol kalani al son rakami
			n = n/10;	// 10 a bol bi sonraki rakama gec 72 gec sonra 7 ...
		}
		
		System.out.println("The sum of the digits: " + sum);

	}

}