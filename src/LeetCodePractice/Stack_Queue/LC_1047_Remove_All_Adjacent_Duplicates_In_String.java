package LeetCodePractice.Stack_Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class LC_1047_Remove_All_Adjacent_Duplicates_In_String {

	
	 public String removeDuplicates(String s) {
	        StringBuilder sb = new StringBuilder(); 

	        for (char ch : s.toCharArray()) {
	            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ch) {
	                sb.deleteCharAt(sb.length() - 1);
	            } else {
	                sb.append(ch);
	            }
	        }
	        return sb.toString();
	    }
}
