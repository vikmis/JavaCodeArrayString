package LeetCodePractice.Array;

import java.util.HashSet;
import java.util.Set;

public class LC_136_Single_Number {
	
	 public int singleNumber(int[] nums) {
	       Set<Integer> st = new HashSet<>();

	       for(int num : nums){
	       if(st.contains(num)){
	        st.remove(num);
	       }else {
	        st.add(num);
	       }
	       }
	      return st.iterator().next();
	    }

}
