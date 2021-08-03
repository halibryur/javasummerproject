package day03increment_decrement_operators;

public class SwapQuestion {

	public static void main(String[] args) {
		/*
		 	Swap the values of two integers.
		 	a=12 and b=5 ==> a=5 and b=12
		*/
		
		//1.Way: Use third container...		
		int a = 12;
		int b = 5;
		int temp = 0;
		System.out.println("Before swap a:" + a);
		System.out.println("Before swap b:" + b);
	
		temp = b;
		b = a;
		a = temp;
		System.out.println("After swap a:" + a);
		System.out.println("After swap b:" + b);
		
		//2.Way: Do not use third container
		int c = 20;
		int d = 15;
		System.out.println("Before swap c:" + c);
		System.out.println("Before swap d:" + d);
		
		c = c + d;//c 35
		d = c - d;//d 20
		c = c - d;// c 15
		System.out.println("After swap c:" + c);
		System.out.println("After swap d:" + d);

		
		
	} 

}