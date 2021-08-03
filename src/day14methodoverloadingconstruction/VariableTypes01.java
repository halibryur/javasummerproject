package day14methodoverloadingconstruction;

	/*
	 	There are 3 main variable types in Java
		 	a)Local Variables: They are created inside a method body
		 	                   You have to initialize(Assigning a value) local variables
		 	                   When you create a variable, Java uses default values for the variables, but
		 	                   if the variable is local variable Java does NOT use default values. 
		 	                   You have to assign a value for local variables, 
		 	                   otherwise when you try to use local variable Java complains
		 	
		 	b)Instance(Object) Variables: If you create a variable outside the methods and inside the class WITHOUT using "static"  ACIKLAMA: BURADA without kullanildi anlama iyi dikkat et!!
		 	                              keyword, it is called "instance(object) variable"
		 	                              
		 	                              Instance variables may initialize or not. 
		 	                              If you initialize, Java uses the value which you assigned for the variable.
		 	                              If you do not initialize, Java uses default value for the variable.
		 	                              
		 	c)Class Variables: If you create a variable outside the methods and inside the class WITH using "static"  ACIKLAMA: BURADA with kullanildi anlama iyi dikkat et!!
		 	
		 	                   keyword, it is called "instance(object) variable"
	 */

public class VariableTypes01 {

	//Instance variables created outside the methods, inside the class  BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB)(INSTANCE(OBJECT) VARIABLE
	//To initialize is optional
	String name = "Ali Can"; // ACIKLAMA user dan eger alacaksak initilizing yapmamz gerek (italic degil burada asaagisiyla kiyas icin  yazi sitili ile)
	char c; // burada initializing yapilmadi java kendisi atiyor o da bos geciyor null olarak
	
	                                                                 //  BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB)(INSTANCE(OBJECT) VARIABLE son nokta
	//Class variables use "static" keyword
	//Class variables created outside the methods, inside the class
	//To initialize is optional
	/*
	 	class variables(static variables) are attached to the class, not to the object
	 	CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC       CLASS VARIABLE
	 */ 
	static String address = "Miami USA"; // static ile yazdik ki class Variable oldu (italic yazi sitili ile) sorun yok print i de asagida static de oldugu icin sorun degil
	//eger buraya alirsak printini sorun gosteriri CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC       CLASS VARIABLE son nokta
	
	
	
	
	
	public static void main(String[] args) { // AAAAAAAAAAAAAAAAAAAAAAAAAAAAA)LOCAL VARIABLE static var. METHOD BODY diger curly e kadar  
		
		//                               
		int y = 11; // rakam vererek initialize(Assigning a value) local variables yapmis olduk 
		//Local variable without initializing
		int z;
		//When you try to use non-initialized local variable Java complains.
		//System.out.println(z);
		
		/*
		 	When you try to use instance variable inside the main method, it complains.
		 	Because, main method is static and static methods do not accept non-static things in it. ACIKLAMA c CHAR olarak belirnemisti ya o yuzden sattic degil
		*/
		//System.out.println(c);
		
		//No complain, because address is static variable
		System.out.println(address);
		//                              AAAAAAAAAAAAAAAAAAAAAAAAAAAAA) Local variable son nokta
	}
	
	
	public int add(int a, int b) { // static yok
		
		//Local variable
		int x = 12;
		
		/*
		 	When you try to use instance variable inside any non-static method, it is fine. ACIKALAMA burada static kullnailmadigi icin  sorun yok
	    */
		System.out.println(c);
		
		return a+b;
	} 

}
