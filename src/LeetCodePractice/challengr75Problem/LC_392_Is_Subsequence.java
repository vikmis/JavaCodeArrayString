package LeetCodePractice.challengr75Problem;

public class LC_392_Is_Subsequence {

	
	public boolean isSubsequence(String s, String t) {
        
	       int i =0;
	       int j=0;
	       while(i<s.length() &&  j<t.length()){

	        if(s.charAt(i)==t.charAt(j)){
	            i++;
	        }
	        j++;
	       }
	       if(i==s.length()){
	        return true;
	       }
	       return false;
	}
}
