package day09stringmanipulations;

import java.util.Scanner;

public class String01 {

	public static void main(String[] args) {
		
		//15.Method: substring() <== Used to get a specific part of a String + Returns String
		String s1 = "Java is easy";
		
		System.out.println(s1.substring(5, 7));//is <== starting index is inclusive, ending index is exclusive ACIKALAM: son sayi gale alinmaz 

		System.out.println(s1.substring(1, 4));//ava
		
		System.out.println(s1.substring(8, 12));//easy <== There is no index 12 but Java will not work with 12, it will use
		                                        //         11 at the end and index 11 exists
		
		System.out.println(s1.substring(8));//easy <== If you want to get all characters from a specific character to the 
		                                    //         last character use substring() with a single parameter
		System.out.println(s1.substring(1));// ava is easy
		System.out.println(s1.substring(0)); // Java is easy
		System.out.println(s1.substring(12));//It returns nothing
		
		/*
		 * Ask user to enter a String
		 * Print the first and the last character of the String on the console.
		 */
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a String");
	String s2 = scanner.nextLine();
//		
	String first = s2.substring(0, 1);// ==>J  ACIKLAMA: JAVA yazisini ele alsak first icin  0==> J , 1 ise hesaba 
//		alinimaz exclusive
		
   String last = s2.substring(s2.length()-1);
		
//      JAVA last icin s2.length()-1 length of JAVA 4 ama -1 dedigimizde 3 olur  oda A cikar
//      s2.length()) Kelimenin tamami icin  de 4 hesaba alinimaz exclusive yani JAVA (0J - 1A - 2V - 3A 
//		
  System.out.println(first + last); // CEVAP JA
		/*
		
		  
		  
		 */
		
		String s3 = "Teach to learn";
		System.out.println(s3.substring(5,5));// Nothing ACIKLAMA: get the 5 diyoruz get the 5 dedigimiz 
		//icin hadi ordan diyor nothing cikiyor:))
		
		//System.out.println(s3.substring(5, 3));// Starting index cannot be greater than ending index
		
		/*
		 	If you get red underline while you type code, it is called "Compile Time Error"
		 	If you get red error messages on the console after running your code, it is called "Run Time Error"
		*/
		
		/*
		     Ask user to enter SSN (9 digits) 
		     Print the SSN on the console after converting first 5 digits to *
		     Ex: 123456789 ==> *****6789
		*/
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter your SSN");
//		String ssn = scanner.next();
//		
//		String ConvertedSsn = "*****" + ssn.substring(5); //6789
		
		//System.out.println(ssn);//123456789
//		System.out.println(ConvertedSsn);//*****6789
		
		//16.Method: trim() <== Used to remove space character from the beginning and end + Returns String
		String s4 = "   Ali Can  ";
		String trimmedString = s4.trim();		
		System.out.println(s4); //   Ali Can   // 3 bastan 3 sondan bosluklu oldugu gibi alir
		System.out.println(trimmedString);//Ali Can sag ve soldaki bosluklari tiraslar
		
		
		//17.Method: isBlank() <== Used to check if a String has characters different from "" and " " + Returns boolean
		String s5 = ""; 
		String s6 = " ";
		String s7 = "    ";
		System.out.println(s5.isBlank());//true
		System.out.println(s6.isBlank());//true
		System.out.println(s7.isBlank());//true
		
		//18.Method: replaceAll() <== Used like replace() + Returns String
		String s8 = "Java is not Lava";
		
		System.out.println(s8.replaceAll("a", "x"));//Jxvx is not Lxvx
		/*
		 Differences between replace() and replaceAll()
		 
		 1)In replace() you can use String and char as parameters
		   but in replaceAll() you can use just String
		   
		 2)In replaceAll(), we can use Regular Expressions(regex) ACIKLAMA:interview da sorulmius 
		   "regex" is some syntaxes which represents multiple characters
		   Example: ACIKLAMA: a) b) c) ve e) siklari onemli bilmelsin
		   a) \\d ==> stands for all digits (0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
		      \\D ==> stands for all characters different from digits
		      
		   b) \\w ==> stands for _ and a-z and A-Z and 0-9
		      \\W ==> stands for characters different from _ and a-z and A-Z and 0-9 
		      
		   c) \\s ==> stands for space
		      \\S ==> stand for characters different from space
		      
		   d) \\A ==> Beginning of the entire String
		      \\Z ==> End of the entire String
		      
		   e) [aby] ==> Stands for all a, b, y // her harfi kullanbilirsin 
		      [^aby] ==> All characters different from a, b, y
		 */
		
		//Example for a)
		String s9 = "A1b234C7";
		System.out.println(s9.replaceAll("\\d", ""));//AbC ACIKLAMA d digit anlamina geliyor
		
		System.out.println(s9.replaceAll("\\D", ""));//12347 Aciklama  D rakam harici herseyi goturur
		
		//Example for b)
		String s10 = "a01_B-C !5x_m ?";
		System.out.println(s10.replaceAll("\\w", "*"));//*****-* !**** ?
		System.out.println(s10.replaceAll("\\W", "*"));//a01_BC**5x_m**
		
		//Example for c)
		String s11 = "   Ali Can  ";
		System.out.println(s11.replaceAll("\\s", ""));//AliCan
		System.out.println(s11.replaceAll("\\S", "*"));//   *** *** 
		
		//Example for d)
		String s12 = " 3,12.99 ";
		System.out.println(s12.replaceAll("\\A", "Dollar"));//Dollar 3,12.99
		System.out.println(s12.replaceAll("\\Z", "Dollar"));// 3,12.99 Dollar
		
		//Example for e)
		String s13 = "ali can bey";
		System.out.println(s13.replaceAll("[liby"+ "]", "*"));//*li c*n *e*
		System.out.println(s13.replaceAll("[^aby]", "?"));//a????a??b?y	
	}
}