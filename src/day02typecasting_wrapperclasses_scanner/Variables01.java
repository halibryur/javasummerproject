package day02typecasting_wrapperclasses_scanner;

public class Variables01 {

	public static void main(String[] args) {
		
		/*
			If you convert a primitive data type to another, 
			it is called "Type Casting"
		*/
		
		//byte < short < int < long < float < double
			
//		//Auto Widening
//		byte age = 65;
//		short newAge = age;
//		System.out.println(age);
//		System.out.println(newAge);
		
		byte age = 65;
		short newAge = age;
		System.out.println(newAge);

//
		int myInt = 9;
	    double myDouble = myInt; // Automatic casting: int to double

	    System.out.println(myInt);      // Outputs 9
	    System.out.println(myDouble);   // Outputs 9.0
		
		//Explicit Narrowing
		long profit = 23445;
		int newProfit = (int) profit;
		System.out.println();
		
		//
		
		double myDouble1 = 9.78d;
	    int myInt1 = (int) myDouble; // Manual casting: double to int

	    System.out.println(myDouble1);   // Outputs 9.78
	    System.out.println(myInt1);      // Outputs 9
		
		
		
		
		
		
		//Type code to convert float to short
		float code = 1.23f;
		short newCode = (short)code;
		System.out.println(code);//1.23
		System.out.println(newCode);//1
		
		//If the number is not in the range of the second data type,
		//Java uses "modulus operation" to put value into the range
		short price = 245;
		byte newPrice = (byte)price;
		System.out.println(price);
		System.out.println(newPrice);
		
		//How to do mathematical operations with different data types
		
		int a = 5;
		double b = 4;
		float e = 4.0f;
		int c = 2;
		int d = 3;
		//Note:If Data types are different Java uses 
		//the larger data type for the result
		
		System.out.println(e+d);
		System.out.println(a+b);//9.0
		
		//If you use same data types, result data type and value will be in the 
		//used data type ==> 2.5 --> Decimal part is removed and the result is 2
		System.out.println(a/c);//2
		System.out.println(a/d);//1
		
		//In double decimal you have 16 digits at most
		System.out.println(b/d);//1.3333333333333333
		
		//In float decimal you have 7 digits at most
		System.out.println(e/d);//1.3333334
	
	}
}