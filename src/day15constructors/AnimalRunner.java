package day15constructors;

public class AnimalRunner {
   public static void main(String[] args) { //entry point baslangic buradan
	   
	   
	   
	                                     // ACIKLAMA : bu kisim da constructor olarak adlandiriliyor  yeni bir scanner kurmus gibi olduk 
	   Animal a01 = new Animal("Puppy");//a01. yazinca Animal dan cekiyor "new Animal" dan sonra Ctrl space yapinca tum constructor lari aciyor
	                                     // day15 ini sec 14 degil "specy" sectik onu sildik Puppy yazdik
	        
	   
	   
	   
	   
	   System.out.println(a01.age); //5     a01. yazinca Animal dan cekiyor 
	   System.out.println(a01.name);//Bobby
	   System.out.println(a01.specy);//Puppy Yukaridaki papi yazan yer specy oluyor 
	   System.out.println(a01.gender);//M
	   System.out.println(a01.isCarnivorous);//false boolean icin deger vermedik bu yuzden default olarak false yazdi
	  
	   
	   System.out.println(Animal.counter);//2
	   
	
}


}

   