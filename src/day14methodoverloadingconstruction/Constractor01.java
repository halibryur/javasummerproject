package day14methodoverloadingconstruction;

/*Constructors are object creators
	Java knows, classes are for Object Creation, to create objects we need "constructors", because of that
	when you create a class Java creates a constructor automatically.
	
	Java gives you a default constructor, which is invisible inside the class.
	
	If you want you can create your own constructor as well.
	
	Note: Constructors are not methods because they do not have return types.
	      In the interview, DO NOT use "constructor method"
	      Constructors are constructor
	      
	Note: Constructor names must be same with the class name.
	
	Interview Question:
	What is the difference between "constructor" and "method"?
	1)Constructors do not have return type but methods have
	2)Methods may have any name as method name but constructors must have class name as constructor name
	
	Note: When you create a class Java gives you default constructor but if you create any constructor Java deletes the default one
	
	Note: Default constructor is constructor without parameters like "public Constructors01(){ }" 
*/

public class Constractor01 { // ACIKLAMA: BU KISIM CONSTRACTOR dir..
	
	public static void main(String[] args) {
		
	}
	
	public int add(int a, int b) { // ACIKLAMA: BU KSIM METHOD DUR! method da istedigimiz ismi koyariz add,multiply vs ama costructor da name class in nameni almak mecburiyetinde
		return a + b;
	}
	
	//How can we create a constructor? ACIKLAMA burasi onmeli main method disinda kuruyoruz parentezlere bakara anlaya bilirsin
	//Access Modifier   +  Class Name() + { } //  class name bilinidgi uzere main method dan once gelen public class diye devemindaki isim 
	public Constractor01() { // Costructors are not method cunku icinde int vs..yok return type da yok
		
		
	}
	
	public Constractor01(int a) { // Constructors icine parameters koyabiliyoruz.. bos da oabilir ici bir ustte oldugu gibi
	
	}
	
	public Constractor01(int a, String s) { // farkli farkli paremeters le yeni constrctor kurmamiza izin veriliyor
		
	}
	
	public Constractor01(char a, double d, String s) {
		
	}

}