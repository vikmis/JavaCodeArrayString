package LeetCodePractice.String;

public class LC_1859_Sorting_the_Sentence {
	
	 public String sortSentence(String s) {
	     
	     String [] words = s.split(" ");
	     String [] arrange = new String[words.length];

	     for(String word : words){
	        int pos = word.charAt(word.length()-1)-'0';
	        arrange[pos -1] = word.substring(0,word.length() - 1);
	     }
	      return String.join(" ", arrange);
	        
	    }

}
