package LeetCodePractice.Array;

import java.util.Arrays;

public class LC_1299_Replace_Elements_with_Greatest_Element_on_Right_Side {
	
	public static int[] replaceElements(int[] arr) {
		
		int temp=0;
	
		int n=arr.length;
		int maxSofar=-1;
		
		for(int i=n-1;i>=0;i--) {
			temp=arr[i];
			arr[i]=maxSofar;
			maxSofar = Math.max(maxSofar, temp);
		}
		
		 return arr;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {17,18,5,4,6,1};
		
		
		
		System.out.println(Arrays.toString(replaceElements(arr)));
		
	}

}

