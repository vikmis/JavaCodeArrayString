package LeetCodePractice.challengr75Problem;

public class LC_1493_Longest_Subarray_of_1_st_After_Deleting_One_Element {

	
	 public int longestSubarray(int[] nums) {
	        int n = nums.length;
	        int zeroCount =0;
	        int maxLen= 0;
	        int left =0;

	        for(int right =0;right<n;right++){
	            if(nums[right]==0){
	                zeroCount++;
	            }

	            while(zeroCount>1){
	                if(nums[left]==0){
	                    zeroCount--;
	                }
	                left++;
	            }

	            maxLen = Math.max(maxLen,right-left);
	        }

	       return maxLen;
	    }
}
