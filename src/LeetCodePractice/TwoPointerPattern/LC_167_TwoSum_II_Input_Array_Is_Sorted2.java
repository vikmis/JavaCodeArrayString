package LeetCodePractice.TwoPointerPattern;

public class LC_167_TwoSum_II_Input_Array_Is_Sorted2 {
	
	public static  int [] returnIndexesOfTwopairSum(int [] number,int target) {
		
		int left =0;
		int right  = number.length-1;
		
		while(left<right) {
			
			int sum = number[left]+number[right];
			 if(sum==target) {
				  return new int[] {left+1,right+1};
			 }
			 else if(sum<target) {
				 left++;
			 }else {
				 right--;
			 }
		}
		return number;
	}
	
	public static void main(String[] args) {
		
		int [] ar = {2,7,11,15};
		int target =9;
		
		int [] index =returnIndexesOfTwopairSum(ar ,target);
		
		System.out.println("[" + index[0] + "," + index[1] + "]");
		
		
	}

}

	