package day11loops;

public class WhileLoop01 {

	public static void main(String[] args) {
		
		/*
		 	Print "Hello!" 5 times on the console
		*/
		
		for(int i=1; i<6; i++) { // ACIKLAMA: Uc asama var loop da starting valua i=1 + conditon to stop i<6;+ increment i++
			
			System.out.println("Hello!");
		}
		
		System.out.println("=====================");
		
		int i=1; // while icin yukaridaki aciklmasini yaptigimiz seyler curly par. icinde olur
		
		while(i<4) {			
			System.out.println("Hello!");			
			i++; // loop yapan kisimimiz bu abi			
		}

	}

}