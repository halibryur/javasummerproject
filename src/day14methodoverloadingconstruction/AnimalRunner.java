package day14methodoverloadingconstruction;

public class AnimalRunner {

	public static void main(String[] args) {
		
		Animal a01 = new Animal(); // created "an object" but not used any parameters<<< ANIMAL DAN CEKIYOR
		
		Animal a02 = new Animal("Bobby", 7, "Bulldog");//parameters<<< ANIMAL DAN CEKIYOR
		
		Animal a03 = new Animal(3, "Puppy"); //parameters<<< ANIMAL DAN CEKIYOR
		
		//If you want to look at the value of a class variable
		//from another class, use class name first then use 
		//variable name by putting "." between them.
		//Like Animal.counter
		System.out.println(Animal.counter);//3 counter ACIKLAMA: i da animal dan cekiyoruz animal 
		                                    //yazmazsak print e cikmaz netice "Animal.counter" once Animal nokta ile kuyruk takiyoruz counter yani.
		
	}

}