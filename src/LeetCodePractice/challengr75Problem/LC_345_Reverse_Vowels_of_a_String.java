package LeetCodePractice.challengr75Problem;

public class LC_345_Reverse_Vowels_of_a_String {
	
	
	 public String reverseVowels(String s) {

	       char ch [] = s.toCharArray();
	        int left =0;
	        int right =s.length()-1;

	        while(left<right){

	            if(!isVowel(ch[left])){
	                left++;
	                continue;

	            }
	            if(!isVowel(ch[right])){
	                right--;
	                continue;

	            }
	             char temp = ch[left];
	            ch[left] =ch[right];
	            ch[right]=temp;
	            left++;
	            right--;
	        }
	        return new String(ch);
	    }
	    private boolean isVowel(char ch){

	        ch = Character.toLowerCase(ch);

	         return (ch=='a' ||ch=='e' || ch=='i' ||
	        ch=='o' || ch=='u')   ;        

	    }

}
