package day20arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List01 {

	public static void main(String[] args) {
		
		/*
		 * From an integer list find the the min difference of the elements 
		 */
		List<Integer> list1 = new ArrayList<>();
		list1.add(2);
		list1.add(153);
		list1.add(31);
//		list1.add(281);
//		list1.add(114);
//		list1.add(16);
//		list1.add(67);
//		list1.add(359);
//		list1.add(120);
//		list1.add(168);
//		list1.add(128);
		
		System.out.println(list1);//[2, 153, 31, 281, 114, 16, 67, 359, 120, 168, 128]
		List<Integer> list2 = new ArrayList<>(); // koyacagimiz bos bir list olusturuyoruz 
		
		for(int i=0; i<list1.size(); i++) { // 0 dan baslar sonuna kadar deavm eder
			for(int k =i+1 ; k<list1.size(); k++) { // 0+1  yani 1 den baslar  0 la kiyaslar 2-153=151, 2-31=29 ...
				list2.add(Math.abs(list1.get(i)-list1.get(k))); // farki bulmak icin cikarma islemi ACIKLAMA GET in anlami al getir demek
			}													// fark negative cikmasin diye Math.abs isi cozuyor
		}
		System.out.println(list2);//[151, 29, 122]
		
		Collections.sort(list2);// kucukten buyuge siralamak icin collections kullandik 
		
		System.out.println(list2);//[29, 122, 151]
		System.out.println(list2.get(0));// basa en kucuk geldigi icin 0 getir dedik sonuc 29 :)
	}

}