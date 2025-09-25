package LeetCodePractice.HashTable;

import java.util.HashMap;
import java.util.Map;

public class LC_242_valid_Anagram {
	
	 public boolean isAnagram(String s, String t) {
	        if (s.length() != t.length()) return false;

	        Map<Character, Integer> map = new HashMap<>();

	        // Step 1: Count chars in s
	        for (char c : s.toCharArray()) {
	            map.put(c, map.getOrDefault(c, 0) + 1);
	        }

	        // Step 2: Subtract counts using t
	        for (char c : t.toCharArray()) {
	            if (!map.containsKey(c)) return false;  // char not in s
	            map.put(c, map.get(c) - 1);
	            if (map.get(c) < 0) return false;  // more chars in t
	        }

	        // Step 3: All counts should be 0
	        for (int count : map.values()) {
	            if (count != 0) return false;
	        }

	        return true;
	    }

}
