package Sapient;

import java.util.Arrays;

public class HigestAndSecondHigestNumber {
	
	

	
	
	public static void main(String[] args) {
		int arr [] = {45,78,90,43,21,56,47,85};
		int sortedArr[] = sortedArray(arr);
		
		System.out.println("sorted array : - " +Arrays.toString(sortedArr));
		for(int i=0;i<sortedArr.length;i++) {
			System.out.println("sorted array : - " +sortedArr[i]);
		}
		
		System.out.println("Higest Element - "+sortedArr[sortedArr.length-1]);
		System.out.println("Second Higest Element - "+sortedArr[sortedArr.length-2]);
	}
	
	
	public static int[] sortedArray(int [] nums) {
		
		int temp ;
		
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]>nums[j]) {
					temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		
		return nums;
	}
	
	
}
