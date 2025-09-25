package LeetCodePractice.windowSliding.FixedSize;

import java.util.HashSet;
import java.util.Set;

public class LC_1876_Substrings_of_Size_Three_with_Distinct_Characters {
	
	 public static int countGoodSubstrings(String s) {
	        
		  int count=0;
		 
		 for(int i=0;i<=s.length()-3;i++) {
			 
			 String window= s.substring(i, i+3);
			 
			  char[] ch = window.toCharArray();
			  
			  Set<Character> newSet = new  HashSet<Character>();
			  for(char c :ch) {
				  
				  newSet.add(c);
			  }
			  if(newSet.size()==3) {
				  count++;
			  }
		 }
		 return count;
	    }
	 
	 public static void main(String[] args) {
		String s = "xyzzaz";
		
		
		System.out.println(countGoodSubstrings(s));
		
	}

}
