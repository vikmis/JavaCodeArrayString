package Sapient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonEleInTwoArray {
	
	public static void main(String[] args) {
		
		int[] list1 = {1, 2, 3, 4, 3};
		int[] list2 = {3, 4, 3, 6};
		
				//ArrayList<Integer> commonList = new ArrayList<Integer>();
		Set<Integer> commonList = new HashSet<Integer>();
		
		for(int num1 : list1) {
			for(int num2 :list2) {
				if(num2==num1) {
					commonList.add(num2);
				}
			}
	}
System.out.println(commonList);
}
}
