package com.array;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveNegElement {
	// move all -ve element to one side of the array

	public static void main(String[] args) {
		int[] arr = { 1, 6, 8, -7, -6, 2, 9, -7 };
		System.out.println("Scrambled array: "+arr.toString());
		arrangElement(arr);
		

	}

	public static void arrangElement(int[] arr) {
		ArrayList<Integer> neg = new ArrayList();
		ArrayList<Integer> pos = new ArrayList();
		int len = arr.length-1;
		for (int i = 0; i <= len; i++) {
			if (arr[i] < 0) {
				neg.add(arr[i]);
			} else {
				pos.add(arr[i]);
			}

		}
		pos.addAll(neg);
		System.out.println("Arrange Element: "+ pos.toString());
	}

}
