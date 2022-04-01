package com.array;

public class MaxMin {
	public static void main(String[] args) {
		int[] arr = {4, 2,6,3,5,1 };
		findMaxMin(arr);
	}
    public static void findMaxMin(int[] nums) {
    	  int max = nums[0];
          int min = nums[0];
   
          // do for each array element
          for (int i = 1; i < nums.length; i++)
          {
              // if the current element is greater than the maximum found so far
              if (nums[i] > max) {
                  max = nums[i];
              }
   
              // if the current element is smaller than the minimum found so far
              else if (nums[i] < min) {
                  min = nums[i];
              }
          }
   
          System.out.println("The minimum array element is " + min);
          System.out.println("The maximum array element is " + max);
      }
}
