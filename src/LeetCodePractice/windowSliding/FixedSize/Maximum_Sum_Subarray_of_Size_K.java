package LeetCodePractice.windowSliding.FixedSize;

public class Maximum_Sum_Subarray_of_Size_K {

	
	public static int maxSumBySizeK(int nums [], int k) {
		
		int maxSum =0;
		int currentSum =0;
		int left=0;
		
		for(int right =0;right<nums.length;right++) {
			
			currentSum= currentSum+nums[right];
			
			if(right>=k-1) {
				
				maxSum = Math.max(maxSum, currentSum);
				currentSum =currentSum-nums[left];
				left++;
			}
		}
		
		return maxSum;
	}
	
	public static void main(String[] args) {
		int[] nums = {2, 1, 5, 1, 3, 2};
		int size =3;
	int	maxSum =maxSumBySizeK(nums,size);
	
	System.out.println(maxSum);
		
	}
}
