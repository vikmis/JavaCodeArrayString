package LeetCodePractice.HashTable;

public class CountTHeFrequencyOfAlphabets2 {
	
	public static void main(String[] args) {
        String s = "banana";

        int[] freq = new int[26]; // only a-z

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;   // increase count
        }

        // Print frequencies
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                char ch = (char) ('a' + i);
                System.out.println(ch + " -> " + freq[i]);
            }
        }
    }

}
