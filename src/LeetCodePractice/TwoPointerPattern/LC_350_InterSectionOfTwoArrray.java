package LeetCodePractice.TwoPointerPattern;

import java.util.Arrays;

public class LC_350_InterSectionOfTwoArrray {
	
	public int [ ] intersection(int[] nums1,int[] nums2) {
		
		
		int  k=0;
		int i =0;
		int j =0;	
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		
		
		
		int intersectionLength = Math.min(nums1.length, nums2.length);
		
		int [] intersection = new int[intersectionLength];
		
		while(i<nums1.length && j < nums2.length) {
			
			if(nums1[i]==nums2[j]) {
				intersection[k++]=nums1[i];
				i++;
				j++;
			}else if(nums1[i]<nums2[j]) {
				i++;
			}else {
				j++;
			}
		}
		
				
		return Arrays.copyOf(intersection,k);
	}
	public static void main(String[] args) {
		
		int nums1[] = {1,2,2,1};
		int nums2[]= {2,2};
		
		LC_350_InterSectionOfTwoArrray ar = new LC_350_InterSectionOfTwoArrray();
		ar.intersection(nums1, nums2);
		
		System.out.print(Arrays.toString(ar.intersection(nums1, nums2)));
		/*
		 * for(int i =0;i<ar.intersection(nums1, nums2).length;i++) {
		 * System.out.print(ar.intersection(nums1, nums2)[i]); }
		 */
	}

}
