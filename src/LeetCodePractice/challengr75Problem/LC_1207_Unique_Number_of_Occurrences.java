package LeetCodePractice.challengr75Problem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LC_1207_Unique_Number_of_Occurrences {
	
	 public boolean uniqueOccurrences(int[] arr) {

	        Map<Integer,Integer> freMap = new  HashMap<>();
	        Set<Integer> uniqFreq = new HashSet<>();

	        for(int num : arr){
	            freMap.put(num,freMap.getOrDefault(num,0)+1);
	        }

	        for(int n : freMap.values()){
	            if(uniqFreq.contains(n)){
	                return false;
	            }else{
	                uniqFreq.add(n);
	            }
	        }
	        return true;
	    }

}
