package LeetCodePractice.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_283_Move_Zeroes {
	
	public static void moveZeroes(int[] nums) {
		
		int k =0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=0) {
				nums[k++]=nums[i];
			}
		}
		while(k<nums.length) {
			nums[k++]=0;
		}
		System.out.println(Arrays.toString(nums));
	}
	
	public static void main(String[] args) {
		
		int [] nums = {0,1,0,3,12};
		moveZeroes(nums);
		
	}

}
