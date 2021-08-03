package day15constructors;

/*
	We use instance variables in constructors as parameters, because constructors create objects
	and they use object related variables which are instance variables.
	
	We do not use class variables inside the constructors, because class variables are related with class
	not with objects
*/

public class Animal {

	String name; // instance variable in class
	int age;// instance variable in class
	boolean isCarnivorous;// instance variable in class
	String specy;// instance variable in class
	char gender;// instance variable in class
	
	static int counter;// class variable 

	public Animal() {  // yukardaki sekmelerden SOURCE gidip generate constrctur  using fild secerek istedigimiz yere ilgili  
		counter++;    // constrctor u koymamiza yardimci olur onceki derste manual olarak yapmistik,	sadece instance variable
		              // oalanalri alir .altta o sekilder aldi class variable almaz cunku constrctor create object not class!!
	}                                                                                                       

	public Animal(String name, int age, boolean isCarnivorous, String specy, char gender) {
		this.name = name;
		this.age = age;
		this.isCarnivorous = isCarnivorous;
		this.specy = specy;
		this.gender = gender;
		counter++;
	}

	public Animal(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		counter++;
		
		
	}

	public Animal(String specy) {
		
		/*
		   1) this() is used for constructor call
		   2)this() must be in the first line inside the constructor
		   3) In a constructor how many times can "this()" be used ? Interview sorusu
		    
		    Answer: At most once. Because this() must be in the first line, if you use more 
		            than once where will you put it? You need to put it into second,third,....etc
		            lines but it is not allowed.
		   
		   	   
		   
		   
		   What is the difference between "this()" and "this" ? Interview sorusu 
		   1)"this()" is used for constructor call, "this" is used for variable call (yani name,age,gender variable oluyor)
		   2)"this()" can be just once, "this" can be used many times.
		   
		   	   	   
		   		   
		 */
		
		
		this("Bobby", 5, 'M'); // ilk line a koyamamiz gerekir baska yere koyarsak hata verir, constructor icinde constructor kurma isini yapiyoruz this() icine hangi siralamda yazarsak 
		                       // oradan cekkeriz parameters lerdeki arguments leri koyduk
		this.specy = specy;
		counter++;
	}
	
	
	

}