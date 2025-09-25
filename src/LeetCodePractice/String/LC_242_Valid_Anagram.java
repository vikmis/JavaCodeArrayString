package LeetCodePractice.String;

import java.util.Arrays;

public class LC_242_Valid_Anagram {
	
	 public boolean isAnagram(String s, String t) {

	        if(s.length()!=t.length()){
	            return false;
	        }
	        char chs[] = s.toCharArray();
	        char cht[] = t.toCharArray();

	        Arrays.sort(chs);
	        Arrays.sort(cht);

	        return Arrays.equals(chs,cht);
	    
	    }

}
