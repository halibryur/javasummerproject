package day12loops;

public class DoWhileLoop03 {

	public static void main(String[] args) {
		
		/*
			 For the String "1234_?!abcdef", type a code to count the number of letters, 
			 the number of digits and the number of others by using do-while loop
		*/
		
		String str = "1234_?!abcdef";
		
		int digitCounter = 0;
		int letterCounter = 0;
		int othersCounter = 0;
		
		int i = 0;// starting value we use inside the loop
		
		do {			
			if(str.charAt(i)>='a' && str.charAt(i)<='z') {	// letter icin yaptik buyuk harf lerde yapi;irdi ama kafa karismasin diye dokunmadik			
				letterCounter++;				
			}else if(str.charAt(i)>='0' && str.charAt(i)<='9') { // aynisini numberlar icin 				
				digitCounter++;				
			}else {	//digerleri icin 			
				othersCounter++;				
			}		
			i++;// bunu koymazssak yukaridaki islemleri dondurmez
		}while(i<str.length()); // once burayi yazdi iflerden assagidaki sayso lardan da once BREAK the loop icin' en disa yazdik

		System.out.println("Letters: " + letterCounter);
		System.out.println("Digits: " + digitCounter);
		System.out.println("Others: " + othersCounter);

	}

}