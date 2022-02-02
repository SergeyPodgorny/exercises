package com.exercises.sorting;

public class SelectionSorting {
	
	
	

	public static void selectSorting(int[] nums) {
		int min;
		int position;
		
		for (int i = 0; i < nums.length; i++) {
			
			min = nums[i];
			position = i;
		
			for (int j = i+1; j< nums.length; j++) {
				if (min > nums[j]) {
					min = nums[j];
					position = j;
				}
			}
			nums[position] = nums[i];
			nums[i]=min;
		}
		
		
				
		resultPrinter(nums);
	}
	
	
	private static void resultPrinter(int[] nums) {
				
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}
		
		
	}
	
	
}
