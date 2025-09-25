package LeetCodePractice.Array;

import java.util.Arrays;


public class LC_480_Running_Sum_of_1d_Array {
	
	public static int[] runningSum(int[] nums) {
		
		int result [] = new int [nums.length];
		
		for(int i=1;i<nums.length;i++) {
			
			result[0]= nums[0];
			
			result[i]= result[i-1]+nums[i];
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		int nums[] = {1,2,3,4};
		System.out.println(Arrays.toString(runningSum(nums)));
	}

}
