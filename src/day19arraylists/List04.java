package day19arraylists;
import java.util.ArrayList;
import java.util.List;
public class List04 {
    public static void main(String[] args) {
        
        /*
        How to remove repeated elements from a list
        */
        
        List<Character> list1 = new ArrayList<>(); // char demedik Character dedik cunku
                                                   // Wrapper Class(Non-Primitive) yaptik 
        list1.add('a');
        list1.add('b');
        list1.add('a');
        list1.add('c');
        list1.add('a');
        list1.add('b');
        list1.add('t');
        
        System.out.println(list1);//[a, b, a, c, a, b, t]
        
        List<Character> list2 = new ArrayList<>(); // tekrar bos bir liste olusturuyoruz ki buraya 
                                                   //yazilsin son islem
        
        for(int i = 0; i<list1.size(); i++) { // list diyoruz "Array" de "length" kullaniyoruz 
            								 // "ArrayList" de "list" kullaniyoruz buna dikkat
                                             // list 1 icin tek tek bakmaya loop yapiyoruz 
        	
            if(!list2.contains(list1.get(i))) { // if list doesnt have 0,1,2...     i index 0 dan devam eder            
                
                list2.add(list1.get(i)); // ekle 
                
            }
        }
        
        System.out.println(list2);
        
    }
}