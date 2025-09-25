package LeetCodePractice.String;

public class LC_58_Length_of_Last_Word {

	 public int lengthOfLastWord(String s) {
	        
	        String []str = s.split(" ");
	        return str[str.length-1].length();
	    }
}
