package day03increment_decrement_operators;

public class Concatenation01 {

	public static void main(String[] args) {
		
		/*
		 	Concatenation: To join Strings
		*/
		
		String fn1 = "Ali";
		String ln1 = "Can";
		System.out.println(fn1 + ln1);//AliCan
		System.out.println(fn1 + " " + ln1);//Ali Can
		
		String fn2 = "Ayse";
		String ln2 = " Han";
		System.out.println(fn2 + ln2);//Ayse Han
		
		//Questions
		System.out.println(fn1 + 2 + 3);//Ali23 String sonrasi birlesme
		
		System.out.println(fn1 + (2 + 3));//Ali5 String sonrasi parantes () ici normal islem
		
		System.out.println(2 + 3 + fn1);//5Ali String oncesi her turlu islem yapar
		
		System.out.println(2 + fn1 + 3*2);//2Ali6
		
		//Question:By using following variables print 61Study-1 on the console
		int numA = 2;
		int numB = 3;
		String str1 = "Study";
		
		System.out.println(numA*numB*(numA+numB)*numA + (numB-numA) + str1 + (numA-numB));//61Study-1
		
		System.out.println(numA*numB + ((numB-numA) + str1) + (numA-numB));//61Study-1
		
		System.out.println( numA*numB + (numB-numA + str1) + (numA-numB));
		
	}

}