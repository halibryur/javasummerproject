package day19arraylists;

import java.util.ArrayList;
import java.util.Collections;

public class Lists01 {

	public static void main(String[] args) {
		
		// ArrayLists are flexible with their size
		// ArrayLists cannot store multiple data type
		// ArrayLists store non primitive data type
		
		
		//How to create a list
		//1. way
		ArrayList<Integer> list = new ArrayList<>(); // array object olusturduk non-primitive yaptik int yerine reperclass Integer koyduk 
		// to print the list on the console : just place the name of the list in the System.out.println()
		
		System.out.println(list); //[]
		
		//How to add elements into a list
		
		list.add(12);
		list.add(5);
		list.add(30);
		list.add(0, 8);
		
		System.out.println(list); // [8, 12, 5, 30]
		
		Collections.sort(list); // we use collections to sort in ascending order ACIKALAMA COLLECTION YAPTIK 
		
		System.out.println(list);//[5, 8, 12, 30]
		
		//how to get a specific element form list
		System.out.println(list.get(2));//12 ACIKLAMA get ile index den aldik
		//System.out.println(list.get(4)); //IndexOutOfBoundsException because there is no index 4 
		
		list.add(25);
		list.add(45);
		list.add(19);
		list.add(-5);
		list.add(128);
		list.add(501);
		list.add(-17);
		
		System.out.println(list);//[5, 8, 12, 30, 25, 45, 19, -5, 128, 501, -17]
		
		/*
		 type a code to find and print the min and max elements form list
		 
		 */
		Collections.sort(list); // tekrar bir daha sort yaptik kucukten buyuge ACIKALAMA TEKRAR COLLECTION YAPTIK 
		System.out.println(list);//[-17, -5, 5, 8, 12, 19, 25, 30, 45, 128, 501]
		int min = list.get(0);
		int max = list.get(list.size()-1);// last elemen e gider hep
		System.out.println("min value is "+ min +"======" + "max value is " + max); // min value is -17======max value is 501
		
		// how to check if the list is empty or not
		System.out.println(list.isEmpty()); // false bos degil
		
		ArrayList<String> list2 = new ArrayList<>(); // list2 yeni olusturduk
		
		System.out.println(list2.isEmpty()); //true
		
		
		//how remove elements form a list
		//by index
//		list.remove(5); //index the index of the element to be removed
		System.out.println(list.remove(5));  //  19 
		System.out.println(list);//[-17, -5, 5, 8, 12, 25, 30, 45, 128, 501]
		
		list.remove(list.indexOf(5));//index of direk gidip 5 buldu 
		
		System.out.println(list);//[-17, -5, 8, 12, 25, 30, 45, 128, 501] 
		
		
		list2.add("Ali");
		list2.add("Veli");
		list2.add("John");
		list2.add("Ayse");
		list2.add("Can");
		
		System.out.println(list2); //[Ali, Veli, John, Ayse, Can]
		
		list2.remove(list2.remove("Ali"));
		
		System.out.println(list2);
		
		
		
		
		
		
	}

}