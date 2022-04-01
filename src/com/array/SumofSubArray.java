package com.array;

public class SumofSubArray {

	public static void subArraySum(int[] arr, int sum) {
		int curr_sum;
		int len = arr.length - 1;
		for (int i = 0; i < len; i++) {
			curr_sum = arr[i];
			for (int j = i + 1; j <= len; j++) {
				if (curr_sum == sum) {
					int p = j - 1;
					System.out.println("Sum found between indexes " + i + " and " + p);
				}
				if (curr_sum > sum || j == len)
					break;
				curr_sum += arr[j];
			}
		}

	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 5, 3, 5, 6, 7, 5 };
		int sumRequired = 13;
		subArraySum(arr, sumRequired);

	}

}
