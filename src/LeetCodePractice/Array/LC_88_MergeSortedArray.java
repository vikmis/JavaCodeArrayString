package LeetCodePractice.Array;

import java.util.Arrays;

public class LC_88_MergeSortedArray {
	
	
	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
		 
		 int result[] = new int [m+n];
		 int k=0;
		int i=0;
		int j=0;
		
		while(i<m && j<n) {
			
			if(nums1[i]>nums2[j]) {
				result[k++]=nums2[j++];
			}else {
				result[k++]=nums1[i++];
			}
			
		}
		while(i<m) {
			result[k++]=nums1[i++];
		}
		while(j<n) {
			result[k++]=nums2[j++];
		}
		System.out.println(Arrays.toString(result));
	 }
	 
	 public static void main(String[] args) {
		 int [] nums1 = {1,2,3,0,0,0} ;
		 int m = 3;
		 int [] nums2 = {2,5,6};
		 int n = 3;
		 
		 merge(nums1,m ,nums2,n);
	}
	}
