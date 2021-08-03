package day18arraysmultidimensionalarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

	public static void main(String[] args) {
		
		/*
		 * 1) Create an integer array together with user
		 * 2) Type code to print minimum and maximum elements
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the array to create an integer array...");
		
		int len = scanner.nextInt();
		int arr[] = new int[len];
		
		int numOfEl = 1;	//element baslangici 1 st element ... 2 element.. icin 1 yazildi (aciklama resimli var)
		do {			
			System.out.println("Enter " + numOfEl + ". element");		
			arr[numOfEl -1] = scanner.nextInt();
			numOfEl++;	
		}while(numOfEl<=len);
		
		System.out.println("Array before sort: " + Arrays.toString(arr));//[11, 13, 12]
		
		 /// ACIKLAMA IKINCI ASAMAYA basliyoruz \\\
		
		//If you want to keep original array after sorting, use Arrays.copyOf() method.
		int brr[] = Arrays.copyOf(arr, len); // orjinal halini n ciktisini istiyorsan bunu yaz istege bagli
		
		//To get min and max elements from an array use sort()
		/*
		 Note: Strings are immutable, it means when you use String methods, the value of the String does not change
		       Arrays are mutable, it means Arrays methods are able to change the arrays as you can see in the 
		       sort() below.
		 */
		Arrays.sort(arr); // ikinci asama sort yapiyoruz
		System.out.println("Array after sort: " + Arrays.toString(arr));//[11, 12, 13]
 // sort yaptiktan sonra assagida ki verileri cekmeye basliyoruz
		System.out.println("Minimum Element: " + arr[0]);// sort sonunda index 0 en kucuk olacagi icin min bu sekilde 
		System.out.println("Maximum Element: " + arr[arr.length-1]); // sort sonunda index en sonu oldugu icin 
		
		System.out.println("Array before sort: " + Arrays.toString(brr)); // yine istersen orjinal hali icin olusturdugumuz int brr[] den cekti

	}
}