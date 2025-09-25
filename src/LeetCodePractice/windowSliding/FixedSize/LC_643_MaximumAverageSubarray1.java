package LeetCodePractice.windowSliding.FixedSize;

public class LC_643_MaximumAverageSubarray1 {
	
	public double findMaxAverage(int [] nums, int k) {
		
		//intialize window
		
		int windowSum =0;
		
		//Calculate first window sum
		for(int i=0;i<k;i++) {
			windowSum =windowSum +nums[i];
		}
		
		//Initialize the result
		int maxSum = windowSum;
		
		//Slide the window
		
		for(int i=k ;i<nums.length;i++) {
			//Remove the Element from the first position
			windowSum =windowSum-nums[i-k];
			//add new element 
			windowSum = windowSum+nums[i];
			//update the result
			
			maxSum = Math.max(maxSum, windowSum);
		}
		
		return (double) maxSum/k;
	}
	
	public static void main(String[] args) {
		
		int nums[] = {1,12,-5,-6,50,3};
		int k =4;
		
		LC_643_MaximumAverageSubarray1 mas = new LC_643_MaximumAverageSubarray1();
		double maxAverage =mas.findMaxAverage(nums, k);
		System.out.println(maxAverage);
		
	}

}
