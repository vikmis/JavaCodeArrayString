package DataStructure;

public class BinarySearchWithRecurssion {
	
public static void main(String[] args) {
		
		int nums [] = {1,2,3,4,5,6,7,8,9};
		int target =6;
		
		int result =binarySearch(nums,target,0,nums.length-1,0);
		if(result!=-1) {
			System.out.println("Element found at the index : "+result);
		}else {
			System.out.println("Element not found ");
		}
		
	}
	
	public static int binarySearch(int [] arr,int target,int start,int end,int step) {
		step++;
		
		if(start>end) {
			System.out.println("Step taken in Binary Search :"+step);
		}
			
		int mid =start + (end-start)/2;
			
		if(arr[mid]==target) {
			System.out.println("step taken by binary Search : "+step);
			return mid;
		}else if(arr[mid]<target){
			return binarySearch(arr,target,mid+1,arr.length-1, step);
			
		}else {
			return binarySearch(arr,target,mid-1,arr.length-1,step);
		}
			
}


}
