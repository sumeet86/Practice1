package com.array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

public class UnionAndIntersection {
	public static void main(String[] args) {
		int[] arr1= {1, 2, 3, 4,5};
		int[] arr2= {4, 5, 6};
		int[] arr3 = {1, 7};
		System.out.println(findUnionAndIntersection(arr1, arr2, arr3));
		
	}
	public static int findUnionAndIntersection(int[] arr1, int[] arr2, int[] arr3) {
		HashSet<Integer> v1 = new HashSet<Integer>();
	
		for (int i = 0; i < arr1.length; i++)
            v1.add(arr1[i]);
		for (int i = 0; i < arr2.length; i++)
			v1.add(arr2[i]);
		for (int i = 0; i < arr3.length; i++)
			v1.add(arr3[i]);
		
		
		return v1.size();
		
	}

}
