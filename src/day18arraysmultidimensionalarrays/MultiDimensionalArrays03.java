package day18arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays03 {
	
	// How to convert 2 dimensional array to 1 dimensional array (interview question)

	public static void main(String[] args) {
		
		int arr[][] = { {1,2}, {3,4,5}};
		
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i].length;
		}
		
		int brr[] = new int[sum];
		int idx = 0;
		
		for(int i=0; i<arr.length; i++) { 
			
			for(int k=0; k<arr[i].length; k++) {
				
				brr[idx] = arr[i][k];
				idx++;
				
			}
		}
		
		System.out.println(Arrays.toString(brr));

	}

}