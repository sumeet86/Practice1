package com.array;

import java.util.Arrays;
import java.util.Collections;

public class KthElementToSort {
	public static void main(String[] args) {
		int[] array = { 6, 6, 3, 8, 4, 9, 2, 5 };
		int position = 9;
		System.out.println(kthSmallestElement(array, position));
		System.out.println(kthLargestElement(array, position));
	}

	public static int kthSmallestElement(int[] arr, int position) {
		try {
			Arrays.sort(arr);
			return arr[position];

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The index you have entered is invalid: ");
			return position;
		}

	}

	public static int kthLargestElement(int[] arr, int position) {
		try {
			int[] arr1;
			Arrays.sort(arr);
					for(int i= arr.length; i>= position; i-- ) {
				
			}
						return arr[position];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The index you have entered is invalid: ");
			return position;
		}

	}
}
