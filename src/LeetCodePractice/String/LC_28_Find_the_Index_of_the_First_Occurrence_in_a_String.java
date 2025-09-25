package LeetCodePractice.String;

public class LC_28_Find_the_Index_of_the_First_Occurrence_in_a_String {

public int strStr(String haystack, String needle) {
        
        int lengthOfneedle = needle.length();

        for(int i =0;i<=haystack.length()-lengthOfneedle;i++){
            if(needle.equals(haystack.substring(i,i+lengthOfneedle))){
                return i;
            }
        }
        return -1;
    } 
}
