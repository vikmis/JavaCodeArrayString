package Arrays;

public class Find_Missing_Number {
	
	public static int missingNumber(int []nums){
		
		int n = nums.length;
				
		int SumOfSeries =n*(n+1)/2;
		int actualSum =0;
		
		for(int num : nums) {
			
			actualSum =num+actualSum;
			
		}
		
		return SumOfSeries - actualSum;
		
	}

	public static void main(String[] args) {
		
		
		int [] nums = {3,0,1};
		
		int result =missingNumber(nums);
		System.out.println("Missing number of this series is : "+result);

	}

}
