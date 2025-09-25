package LeetCodePractice.Array;

import java.util.Arrays;

public class LC_1089_Duplicate_Zeros {
	
	 public static void duplicateZeros(int[] arr) {
		 
		 int n = arr.length;
		 
		 for(int i=0;i<n;i++) {
			 
			 if(arr[i]==0) {
				 
				 for(int j = n-1;j>i;j--) {
					 arr[j]=arr[j-1];
				 }
				 if(i+1<n) {
					 arr[i+1]=0;
				 }
				 i++;
			 }	
			 
			 
			
	 }
		 System.out.println(Arrays.toString(arr));
}
	 
	 public static void main(String[] args) {
		
		 int[] arr = {1,0,2,3,0,4,5,0};
		 duplicateZeros(arr);
	}
}
	 
	 


