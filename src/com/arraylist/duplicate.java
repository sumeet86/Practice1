package com.arraylist;

import java.util.HashSet;
import java.util.Set;

public class duplicate {
	public static void main(String[] args) {
		int arr[]= {1, 3, 5, 3, 6, 6, 5};
		Set<Integer> data = new HashSet<Integer>();
		for(int i =0; i< arr.length; i++) {
			if (data.add(arr[i])==false) {
				System.out.println(arr[i]);
			}
		}
	}

}
