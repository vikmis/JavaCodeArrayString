package LeetCodePractice.String;

public class LC_541_Reverse_String_II {

	 public String reverseStr(String s, int k) {
	        
	        StringBuffer sb = new StringBuffer();

	        for(int i=0;i<s.length();i=i+2*k){

	            int endFirst = Math.min(i+k,s.length());
	            String firstpart = new StringBuffer(s.substring(i,endFirst)).reverse().toString();

	            int endSecond = Math.min(i+2*k,s.length());
	            String secondpart = s.substring(endFirst,endSecond);

	            sb.append(firstpart).append(secondpart);
	        }
	        return sb.toString();
	    }
}
