package LeetCodePractice.windowSliding.FixedSize;

import java.util.Arrays;

public class LC_1984_Minium_Difference_Between_Highest_and_Lowest_of_K_Scores {

	 public int minimumDifference(int[] nums, int k) {
		    
         int windowDiff =0;
         Arrays.sort(nums);
        windowDiff = nums[k-1]-nums[0];
    int MinDiff =windowDiff;

    for(int i=k;i<nums.length;i++){
        windowDiff =nums[i]-nums[i-k+1];
        MinDiff = Math.min(MinDiff,windowDiff);

    }

        return MinDiff;
    }
}
