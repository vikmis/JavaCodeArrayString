package LeetCodePractice.TwoPointerPattern;

import java.util.Arrays;



public  class LC_167_TwoSum_II_Input_Array_Is_Sorted {
	
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
