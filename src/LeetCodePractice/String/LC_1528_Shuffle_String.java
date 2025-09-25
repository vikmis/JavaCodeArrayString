package LeetCodePractice.String;

public class LC_1528_Shuffle_String {
	
	 public String restoreString(String s, int[] indices) {
	        
	      //char ch[] = s.toCharArray();
	      char newchar[] = new char[s.length()];

	      for(int num : indices){
	        newchar[indices[num]]=s.charAt(num);

	      }
	        return String.valueOf(newchar);
	    }

}
