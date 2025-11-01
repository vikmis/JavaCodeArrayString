package LeetCodePractice.challengr75Problem;

public class LC_1456_Maximum_Number_of_Vowels_in_a_Substring_Given_Length {
	
	 public int maxVowels(String s, int k) {
	        
	        int count =0;
	        int maxCount=0;
	        for(int i=0;i<k;i++){
	            if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u')
	            count++;
	        }
	        maxCount =count;


	        for(int i=k;i<s.length();i++){

	            if(s.charAt(i-k)=='a' ||s.charAt(i-k)=='e'||s.charAt(i-k)=='i'||s.charAt(i-k)=='o'||s.charAt(i-k)=='u'){
	                count--;
	            }
	             if(s.charAt(i)=='a' ||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
	                count++;
	            }
	            maxCount = Math.max(maxCount,count);
	        }
	    return maxCount;
	    }

}
