package LeetCodePractice.windowSliding.DynamicSize;

import java.util.HashMap;
import java.util.Map;

public class LC_594_Longest_Harmonious_Subsequence {
	
	public int findLHS(int[] nums) {
        Map<Integer,Integer> freq  = new HashMap<>();

        for(int num : nums){

            freq.put(num,freq.getOrDefault(num,0)+1);   
        }
        
        int maxLen = 0;

        for(Integer num : freq.keySet()){
            if(freq.containsKey(num+1)){
            int length = freq.get(num) + freq.get(num + 1);
               maxLen = Math.max(maxLen, length);
            }
        }

        return maxLen;
    }

}
