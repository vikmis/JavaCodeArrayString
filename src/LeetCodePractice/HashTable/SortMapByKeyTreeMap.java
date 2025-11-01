package LeetCodePractice.HashTable;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapByKeyTreeMap {
	
	 public static void main(String[] args) {
	        // Original HashMap (unordered)
	        Map<String, Integer> map = new HashMap<>();
	        map.put("banana", 2);
	        map.put("apple", 5);
	        map.put("cherry", 3);
	        map.put("mango", 1);

	        System.out.println("Original Map (HashMap, Unordered):");
	        for (Map.Entry<String, Integer> entry : map.entrySet()) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }

	        // TreeMap automatically sorts by keys
	        Map<String, Integer> sortedByKey = new TreeMap<>(map);

	        System.out.println("\nSorted Map (TreeMap, By Keys):");
	        for (Map.Entry<String, Integer> entry : sortedByKey.entrySet()) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }
	    }

}
