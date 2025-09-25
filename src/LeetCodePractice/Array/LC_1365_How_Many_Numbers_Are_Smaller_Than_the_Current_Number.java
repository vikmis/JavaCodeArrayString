package LeetCodePractice.Array;

import java.util.Arrays;

public class LC_1365_How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
	
	 public static int[] smallerNumbersThanCurrent(int[] nums) {
		 
		 int count=0;
	        int result[] =new int[nums.length];
	        for(int i=0;i<nums.length;i++){

	            for(int j=0;j<nums.length;j++){
	                if(nums[i]>nums[j]){
	                  count++;
	                }
	            }
	            result[i]=count;
	            count=0;
	        }
	        return result;
	 }
	 
	 public static void main(String[] args) {
		 
		 int nums [] = {8,1,2,2,3};
		 
		 System.out.println( Arrays.toString( smallerNumbersThanCurrent(nums)));
		 
	}
}