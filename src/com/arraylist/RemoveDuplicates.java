package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	public void removeDuplicates(ArrayList arr) {
		
		Set set = new LinkedHashSet();
		set.addAll(arr);
		arr.clear();
		arr.addAll(set);
		System.out.println(set);
	}
	public static void main(String[] args) {
		int[] arr = {1, 3, 2, 3, 3, 4, 5 ,7,7,5, 1};
		ArrayList<Integer> list = new ArrayList<>();
		for(int i =0; i<= arr.length-1; i++) {
			list.add(arr[i]);
		}
		
		RemoveDuplicates rd= new RemoveDuplicates();
		rd.removeDuplicates(list);
		
	}

}
