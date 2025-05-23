package Arrays;

public class Product_of_Array_Except_Self {

	public static void main(String[] args) {
		 int[] nums = {1, 2, 3, 4};
	        int[] result = productArray(nums);
	        
	        System.out.print("Product except self: ");
	        for (int num : result) {
	            System.out.print(num + " ");
	        }
	        // Output: 24 12 8 6
	    }
	
	
	public static  int[] productArray(int [] nums) {
		
		int [] output = new int[nums.length];
		
		int prefix =1;
		int suffix =1;
		
		for(int i=0;i<nums.length;i++) {
			output[i]=prefix;
			prefix =prefix*nums[i];
		}
		for(int i=nums.length-1;i>=0;i--) {
			output[i]=output[i]*suffix;
			suffix =suffix*nums[i];
		}
		return output;
	}
}
