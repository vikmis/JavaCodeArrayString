package DataStructure;

public class LinearSearch {
	
	public static void main(String[] args) {
		
		int nums [] = {1,2,3,4,5,6,7,8,9};
		
		int target =6;
		
		int result =linearSearch(nums,target);
		
		if(result!=-1) {
			System.out.println("Element found at the index :"+result);
		} else {
			System.out.println("Element not found");
		}
		
		
		
	}

	public static int linearSearch(int [] arr, int target) {
		int step =0;
		for(int i = 0;i<arr.length;i++) {
			step++;
			if(arr[i]==target) {
				System.out.println("Step taken in Linear Search is : "+step	);	
				return i;
			}
			
			
		}
		System.out.println("Step taken in Linear Search is : "+step	);	
		return -1;
	
	}

}
