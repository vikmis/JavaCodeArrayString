package Rough;

import java.util.ArrayList;
import java.util.List;

public class FindPairOfElementTargetSum {
	
	public static List<int[]>pairOdSum(int arr [] ,int target) {
		
		ArrayList<int []> result = new ArrayList<int[]>();
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]+arr[j]==target) {
					result.add(new int[] {arr[i],arr[j]});
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		int []nums = {2, 7, 11, 15, 3, 6, 5, 4};
		int target =9;
		
		 List<int[]> ar = pairOdSum(nums,target);
		 
		 for(int [] list :ar) {
			 
			 System.out.println("pairs are : "+ "("+list[0]+","+list[1]+")");
		 }
	}

}
