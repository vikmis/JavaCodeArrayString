package LeetCodePractice.windowSliding.DynamicSize;

import java.util.HashMap;
import java.util.Map;

public class LC_159_Longest_Substring_with_At_Most_Two_Distinct_Characters {
	
	 public int lengthOfLongestSubstringTwoDistinct(String s) {
	        Map<Character, Integer> freq = new HashMap<>();
	        int left = 0, maxLen = 0;

	        for (int right = 0; right < s.length(); right++) {
	            char c = s.charAt(right);
	            freq.put(c, freq.getOrDefault(c, 0) + 1);

	            // shrink until distinct <= 2
	            while (freq.size() > 2) {
	                char leftChar = s.charAt(left);
	                freq.put(leftChar, freq.get(leftChar) - 1);
	                if (freq.get(leftChar) == 0) {
	                    freq.remove(leftChar);
	                }
	                left++;
	            }

	            maxLen = Math.max(maxLen, right - left + 1);
	        }

	        return maxLen;
	    }

}
