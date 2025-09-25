package LeetCodePractice.String;

public class LC_557_Reverse_Words_in_a_String_III {
	
	 public String reverseWords(String s) {
	        
	        String [] words=s.split(" ");
	        StringBuilder sb = new StringBuilder();
	        for(int w=0;w<words.length;w++){
	            char ch[] = words[w].toCharArray();

	            int left=0; int right=ch.length-1;
	            while(left<right){
	                char temp=ch[left];
	                ch[left] = ch[right];
	                ch[right]= temp;
	                left++;
	                right--;
	            }

	            sb.append(ch);
	            if(w!=words.length-1){
	                sb.append(" ");
	            }
	           

	        }

	      return sb.toString();
	      
	    }

}
