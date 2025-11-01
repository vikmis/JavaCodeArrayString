package LeetCodePractice.HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeleteSecondMaxBySorting {

	
	public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 3);
        map.put("banana", 1);
        map.put("cherry", 2);
        map.put("mango", 5);
        map.put("grapes", 4);

        System.out.println("Original Map:");
        System.out.println(map);

        // Convert to list and sort by value (descending)
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue())); // descending

        if (list.size() < 2) {
            System.out.println("Not enough elements to find second maximum");
            return;
        }

        // Second maximum entry
        Map.Entry<String, Integer> secondMaxEntry = list.get(1);
        System.out.println("Second Maximum = " + secondMaxEntry);

        // Remove from map
        map.remove(secondMaxEntry.getKey());

        System.out.println("Map after removing second maximum:");
        System.out.println(map);
    }
}
