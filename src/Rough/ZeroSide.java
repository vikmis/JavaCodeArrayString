package Rough;

import java.util.Arrays;

public class ZeroSide {
	
	public static int [] moveZero(int [] arr) {
		
		int i=0;
		int n =arr.length;
		int k=0;
		int result [] = new int[n];
		while(i<n) {
			if(arr[i]!=0) {
				result[n-1-k] =arr[i];
				k++;
				
			}
			i++;
			
		}
		return result;
	}
	
	public static void main(String[] args) {
		int [] arr = {1,0,2,0,3,5,6,0,4};		
		
		System.out.println(Arrays.toString(moveZero(arr)));
	}

}
