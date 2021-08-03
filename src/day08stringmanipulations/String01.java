package day08stringmanipulations;

public class String01 {

	public static void main(String[] args) {
		
		/*
		 	"Learn Java earn money" I want you to find the index of 'e' inside the second "earn"
		*/
		String s1 = "Learn Java earn money";
		
		System.out.println(s1.indexOf("earn", 5));//11
		
		//9.Method: lastIndexOf() <== It returns the index of last occurence of a character + Returns int
		System.out.println(s1.indexOf("e"));//1
		
		System.out.println(s1.lastIndexOf("e"));//19
		System.out.println(s1.lastIndexOf('e'));//19 <== lastIndexOf() accepts char as a parameter
		
		System.out.println(s1.lastIndexOf(" "));//15
		System.out.println(s1.lastIndexOf(' '));//15
		
		System.out.println(s1.lastIndexOf(""));//21
		
		System.out.println(s1.lastIndexOf("X"));//-1 <== For non-existing characters, it returns -1
		System.out.println(s1.lastIndexOf('X'));//-1
		
		System.out.println(s1.lastIndexOf("Java"));//6 <== It found the last Java, then returned the index of first character ACIKLAMA ilk baslangic harfine bakar Java'nin J sinin sirasi
		System.out.println(s1.lastIndexOf("Learn"));// 0
		System.out.println(s1.lastIndexOf("earn"));//11
		
		System.out.println(s1.lastIndexOf('a', 11));//9 <== lastIndexOf() gets the first 10 characters in that example
		                                            //      then returns the index of a ACIKLAMA: verilen rakama gider yoksa geride kalna ilkini alir
		System.out.println(s1.lastIndexOf('a', 12));//12 kendi 
		System.out.println(s1.lastIndexOf('a', 13));//12
		System.out.println(s1.lastIndexOf("e", 14));//11 <== Aciklama:14 e once gider sonra 14 icindeki son e ye bakar sonuc 
		
		/*
		  How can you understand a character is used just once in a String by using indexOf() and lastIndex() methods
		  Ex: "HHelloo" ==> indexOf("H") --> 0   lastIndexOf("H") --> 1
		  					indexOf("l") --> 3   lastIndexOf("l") --> 4
		  					
		  					indexOf("e") --> 2   lastIndexOf("e") --> 2  
		  					For non-repeated values indexOf() and lastIndex() methods return same value
	   */
		
		//10.Method: startsWith() <== Used to check the initial of a String + Returns boolean Aciklama: yani true false 
		String s2 = "Java is easy";
		
		System.out.println(s2.startsWith("J"));//true <== startsWith() method works just with Strings 
		//Aciklama: Char hata verir 'J' hatali olur
		
		System.out.println(s2.startsWith("j"));//false
		
		System.out.println(s2.startsWith("Java"));//true
		System.out.println(s2.startsWith("Javax"));//false
		
		System.out.println(s2.startsWith("i", 5));//true <== After the 5 characters, Java will check if the next character 
		                                          //         is "i" or not
		
		
		//11.Method: endsWith() <== Used to check the last character/s of a String + Returns boolean 
		//Aciklama: Char kullanilmaz
		System.out.println(s2.endsWith("y"));//true
		System.out.println(s2.endsWith("m"));//false
		System.out.println(s2.endsWith("easy"));//true
		
		//12.Method: isEmpty() <== Checks if a String is empty String or not + Returns boolean
		//                         If isEmpty() returns true, it means the length of the String is zero
		String s3 = "";
		String s4 = null;
		System.out.println(s2.isEmpty());//false
		System.out.println(s3.isEmpty());//true
		//System.out.println(s4.isEmpty());//NullPointerException <== Do not use isEmpty() for null String 
		//Aciklama:ERR cikar kirmizi
		
		//13.Method: concat() <== Used to concatenate two or more Strings + Returns Strings
		String s5 = "Ali";
		String s6 = "Can";
		
		System.out.println(s5 + s6);//AliCan <== + --> Addition for integers
		                            //       <== + --> Addition for chars
		                            //       <== + --> Concatenation for Strings		
		System.out.println(s5.concat(s6).concat(" Wooow!"));//AliCan Wooow! Aciklama: eger Java uretmisse
		//onu kullna + kullanama bosuana
		
		//14.Method: replace() <== Used to replace new characters instead of old characters + Returns String
		String s7 = "$3,199.99";
		System.out.println(s7.replace("$", "").replace(",", "").replace(".", "")); // Aciklama bos gec demek icin "" kullanilir
		
		String s8 = "Java ahh Java!...";
		System.out.println(s8.replace("Java", "Python"));//Python ahh Python!... Aciklama: ("Java", "J") single character olmaz!
		
		String s9 = "Saltwater Fishing Boats"; //Convert s9 to saltwater_fishing_boats
		System.out.println(s9.toLowerCase().replace(" ", "_"));
		
		String s10 = "Java"; // J_A_V_A_
		//1.Way
		System.out.println(s10.toUpperCase().replace("A", "_A_"));
		//2.Way
		System.out.println(s10.replace("a", "_A_").replace("v", "V"));
		
		System.out.println(s10.replace("", "/"));// ==> /J/a/v/a/
		
		String s11 = "Java is";
		System.out.println(s11.replace("", "!")); // ==> !J!a!v!a! !i!s! 		
		System.out.println(s11.replace('a', 'x'));// Jxvx is <== replace() can be used with chars and Strings	Aciklama: ama ikisi de ayni olacak farkli farkli olmaz

	}

}