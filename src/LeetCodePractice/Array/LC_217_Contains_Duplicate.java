package LeetCodePractice.Array;

public class LC_217_Contains_Duplicate {
	
	 public boolean containsDuplicate(int[] nums) {
	        
	     Set<Integer> set = new HashSet<>();

	    for(int num : nums){
	         if(set.contains(num)){
	            return true;
	         }
	         set.add(num);
	    }
	    return false;
	}

}
