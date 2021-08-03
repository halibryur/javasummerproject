package day20arraylists;
import java.util.ArrayList;
import java.util.List;
public class List02 {
    public static void main(String[] args) {
        
        /*
         Create a method to increase each element by 3
         */
        List<Integer> list1 = new ArrayList<>();
        
        list1.add(12);
        list1.add(5);
        list1.add(7);
        list1.add(20);
        list1.add(25);
        list1.add(128);
        
        increaseEachElement(list1); // bunu yazmassak print cikmiyor 
        
        
    }
    public static void increaseEachElement(List<Integer> list1) {
        
        for(int i = 0; i< list1.size(); i++) {
            
            list1.set(i, list1.get(i)+3); // set ile list1 index ine gidiyoruz Java kendi methodu
            								// 0 git 0 dakine 3 ekle yukarda her birine loop yapiyor
        }
        
        System.out.println(list1);
    }
    
    
}