package day17arrays;

import java.util.Arrays;

public class Array02 {

	public static void main(String[] args) {
		
		String s[] = new String[5];
		
		s[0] = "Ali Can";
		s[1] = "Veli Han";
		s[2] = "Ayse Tan";
		s[3] = "John Walker";
		s[4] = "John Walker";
		
		System.out.println(Arrays.toString(s));//[Ali Can, Veli Han, Ayse Tan] ACIKLAMA string reference olarak baska bir
		                                       // yerden adres olarak alir normalde direk almaz 
		
		//How to print all elements one by one on the console
		//1.Way: Not recommended
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		
		//2.Way: Use loops
		//for(int i=0; i<3; i++) burada isimleri  3 kadar cikarmis oluruz ama "dynamic" degil "hard coding"
		for(int i=0; i<s.length; i++) { //  array oldugu icin length() parantez koyulmuyor "dynamic" hale getirdik
			System.out.println(s[i]);	
		}
		
		/*
		 	1)Create a double array whose length is 6
		 	2)Type a program to add all elements inside the array
		 	3)Print the sum on the console.
		*/		
		double d[] = {1.2, 3.5, 4.21, 4.3, 6.54, 12,32};// double d[] = {2.2, 3.4, 4.6, 6.7, 9.6}
		double sum = 0; // sum container olusturuyoruz  ki assign edelim toplamalari
		for(int i=0; i<d.length; i++) {
			sum  = sum + d[i];	// toplamayi yapan abimiz burasi teker teker for loop dan cekip hallediyor
		}
		System.out.println("Sum of all elements in array d: " + sum);
	}
}