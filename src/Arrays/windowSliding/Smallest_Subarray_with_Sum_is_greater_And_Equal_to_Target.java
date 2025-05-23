package Arrays.windowSliding;

public class Smallest_Subarray_with_Sum_is_greater_And_Equal_to_Target {
	
	public static int smallestSubArray(int [] nums,int target) {
		
		 int left = 0, currentSum = 0, minLength = Integer.MAX_VALUE;
		    for (int right = 0; right < nums.length; right++) {
		        currentSum += nums[right];  // Expand window
		        while (currentSum >= target) {  // Shrink window
		            minLength = Math.min(minLength, right - left + 1);
		            currentSum -= nums[left++];
		        }
		    }
		    return minLength == Integer.MAX_VALUE ? 0 : minLength;
	}

}
