package Arrays;

public class Maximum_Subarray_Kadanes_Algorithm {

	public static void main(String[] args) {
	
		int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubArray(nums);
        System.out.println("Maximum subarray sum: " + result); // Output: 6 (subarray [4, -1, 2, 1])
	}
	
	public static int maxSubArray(int [] nums) {
		
		int maxSum =nums[0];
		int currentSum =nums[0];
		for(int i=0;i<nums.length;i++) {
			currentSum =Math.max(nums[i], currentSum+nums[i]);
			maxSum= Math.max(maxSum, currentSum);
		}
		
		
		return maxSum ;
		
		
	}
	

}
