package com.exercises.max.even.numbers;

public class FindNumbersWithevenDigits {
	
	
	
	private static int numberOfDigits(int n) {
		int count = 0;
		
		while (n != 0) {
			n /= 10;
			count++;
		}
		return count;
		
	}
	
	
	public static void getEvenDigits(int[] nums) {
		int result = 0;
		for(int i = 0; i <nums.length; i++ ) {
			
			if (numberOfDigits(nums[i]) %2 == 0) {
				result ++;
			}
			
		}
		
		System.out.println(result);
	}
	

}
