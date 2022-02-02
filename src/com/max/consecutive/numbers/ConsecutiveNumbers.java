package com.max.consecutive.numbers;

public class ConsecutiveNumbers {
	
	public static void getConsecutiveNumbers(int nums[]){
		
		int i = 0;
		int consecutiveMaximum = 0;
		
		while(i < nums.length) {
			
			int countOnes = 0;
			while (i < nums.length && nums[i] == 1) {
				countOnes++;
				i++;
			}
			
			consecutiveMaximum = Math.max(consecutiveMaximum, countOnes);
			i++;
			
		}
		
		System.out.println(consecutiveMaximum);
	}
	
	
	

}
