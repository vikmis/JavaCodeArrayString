package Arrays;

public class ArrayRotation {
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        
        System.out.print("Original array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        
        rotate(nums, k);
        
        System.out.print("\nAfter rotating by " + k + " steps: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
		
	}
	
	public static void rotate(int nums [], int k) {
		
		int n =nums.length;
		if(k>n) {
			k=k%n;
		}
		if(k==0) {
			return ;
		}
		
		reverse(nums,0,n-1);
		
		reverse(nums,0,k-1);
		 reverse(nums,k, n-1);
		
		
	}//[1, 2, 3, 4, 5, 6, 7]
	
	public static void reverse(int[] nums, int start, int end) {
		
	while(start<end) {
			int temp =nums[start];
			nums[start]=nums[end];
			nums[end]=temp;
			start++;
			end--;
	}
		
	}

}
