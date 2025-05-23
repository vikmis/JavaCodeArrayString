package Arrays.TwoPointerPattern;

import java.util.ArrayList;
import java.util.List;

public class TwoSumProbleamformultiplepar {
	
	public static List<int []> sumTwoArrya(int [] nums, int target ){
		
		List<int []> result =new ArrayList<>();
		for(int i=0;i<nums.length;i++) {
			for(int j =i+1;j<nums.length;j++) {
				if(nums[i]+nums[j]==target) {
					result.add(new int[] {i,j});
				}
			}
		}
		return result;
	}
	public static void main(String[] args) {
		
		int []nums = {2, 7, 11, 15, 3, 6, 5, 4};
		int target =9;
		
	List<int[]> results = sumTwoArrya(nums,target);
		
		if(results.isEmpty()) {
			  System.out.println("No pairs found");
		}else {
			System.out.println("All index pairs that sum to " + target + ":");
			for(int [] pair:results) {
			    System.out.println("[" + pair[0] + ", " + pair[1] + "]");
			}
		}
	  
		
	} 
}
