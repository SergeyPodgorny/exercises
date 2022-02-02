package com.exercises.linearsearch;

public class LinearSearch {
	
	
	public static void findNumberWithLinearSearch(int nums[], int targetNumber) {
		
		
		for(int i = 0; i < nums.length; ) {
			i++;
			if (nums[i] == targetNumber) {
				System.out.println("Requested number has been found at position" + " " + i);
				break;
			}
			
			else { 
				System.out.println("Requested value has not been found");
			}
			break;
		
		}
		
		
	}

}
