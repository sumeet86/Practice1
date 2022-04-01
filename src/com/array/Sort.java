package com.array;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		int[] array = {1, 9, 0, 7, 6};
		sortedArray(array);
	}
	public  static void sortedArray( int[] array) {
		 Arrays.sort(array);
		 System.out.println(Arrays.toString(array));
		 System.out.println(array);
		 for(int i = 0; i <= array.length-1; i++)
		 {
			 System.out.println(array[i]);
		 }
		//return sorted;
		
	}

}
