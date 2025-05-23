package DataStructure;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int nums [] = {1,2,3,4,5,6,7,8,9};
		int target =6;
		
		int result =binarySearch(nums,target);
		if(result!=-1) {
			System.out.println("Element found at the index : "+result);
		}else {
			System.out.println("Element not found ");
		}
		
	}
	
	public static int binarySearch(int [] arr,int target) {
		
		int start =0;
		int step =0;
		
		int end = arr.length-1;
		
		while(start<=end) {
			step++;
			
			int mid =start + (end-start)/2;
			
		if(arr[mid]==target) {
			System.out.println("step taken by binary Search : "+step);
			return mid;
		}else if(arr[mid]<target){
			start =mid+1;
			
		}else {
			end = mid-1;
		}
		
		
		
	}
		System.out.println("step taken by binary Search : "+step);
		return -1;

	
}

}