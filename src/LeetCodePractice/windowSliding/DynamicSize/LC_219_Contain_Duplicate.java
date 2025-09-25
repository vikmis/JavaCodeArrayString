package LeetCodePractice.windowSliding.DynamicSize;

import java.util.HashSet;
import java.util.Set;

public class LC_219_Contain_Duplicate {
	
public boolean isDuplicatePrsentUnderKLength(int [] nums, int k) {
		
	Set<Integer> window  = new HashSet<>();
		
		for(int i=0;i<nums.length;i++) {
			 if(window.contains(nums[i])) {
				 return true;
			 }
			
		window.add(nums[i]);
		
		if(window.size()>k) {
			window.remove(nums[i-k]);
		}
			
		}
	
		return false;
	}

public static void main(String[] args) {
	
	int nums[]= {1,0,1,1};
	int  k=1;
	LC_219_Contain_Duplicate cd = new LC_219_Contain_Duplicate();
	
	System.out.println(cd.isDuplicatePrsentUnderKLength(nums, k));
	
	
}
	
}
	
	
	


