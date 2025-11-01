package LeetCodePractice.BinearySearch;

public class LC34_Find_First_and_Last_Position_of_Element_in_Sorted_Array {

	
	 public int[] searchRange(int[] nums, int target) {
	        int first = findFirst(nums, target);
	        int last = findLast(nums, target);
	        return new int[]{first, last};
	    }

	    private int findFirst(int [] nums,int target){
	          int start = 0, end = nums.length - 1;
	        int index = -1;

	        while (start <= end) {
	            int mid = start + (end - start) / 2;
	            if (nums[mid] == target) {
	                index = mid;   
	                end = mid - 1;
	            } else if (nums[mid] < target) {
	                start = mid + 1;
	            } else {
	                end = mid - 1;
	            }
	        }
	        return index;
	    }

	    private int findLast(int[] nums, int target) {
	        int start = 0, end = nums.length - 1;
	        int index = -1;

	        while (start <= end) {
	            int mid = start + (end - start) / 2;
	            if (nums[mid] == target) {
	                index = mid;   
	                start = mid + 1;
	            } else if (nums[mid] < target) {
	                start = mid + 1;
	            } else {
	                end = mid - 1;
	            }
	        }
	        return index;
	    }
}
