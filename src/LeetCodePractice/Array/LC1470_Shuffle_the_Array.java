package LeetCodePractice.Array;

import java.util.Arrays;

public class LC1470_Shuffle_the_Array {
	
	public static  int[] shuffle(int[] nums, int n) {
		
		
		   int [] result = new int[nums.length];
		   int k=0;
		   int i=0;
		   int j=n;
		   
		   while(i<n) {
			   result[k++]=nums[i++];
			   result[k++]=nums[j++];
			   
		   }
		   return result;
	}
	
	public static void main(String[] args) {
		int[] nums = {2,5,1,3,4,7};
		
		int n=3;
		
		System.out.println(	Arrays.toString(shuffle(nums,n)));
		
		
	}

}
