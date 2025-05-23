package Arrays.TwoPointerPattern;

import java.util.Arrays;

/*Two Sum Problem
Problem Statement: Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target. You may assume that each input would have exactly one solution, and you may not use the same element twice.
Example:
Input: nums = [2, 7, 11, 15], target = 9
Output: [0, 1]
Explanation: Because nums[0] + nums[1] = 2 + 7 = 9, we return [0, 1]*/

public  class SumTwoArrayProblemForOnepair {
	
	public static int [] sumTwoArrya(int [] nums, int target ) {
		int []result =new int [2];
		for(int i=0;i<nums.length;i++) {
			
			for(int j=i+1;j<nums.length;j++) {
				int sum = nums[i]+nums[j];
				if(sum==target) {
					result[0]=i;
					result[1]=j;
					return result;
				}
				
			}
			
			
		}
		return result;
	}
	
public static void main(String[] args) {
	
	int []nums = {2, 7, 11, 15};
	int target =9;
	
	
	int result [] =sumTwoArrya(nums,target);
    System.out.println("[" + result[0] + ", " + result[1] + "]");
	
}

}
