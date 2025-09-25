package LeetCodePractice.windowSliding.DynamicSize;

import java.util.HashMap;
import java.util.Map;

public class LC_3_Longest_Substring_Without_Repeating_Characters {
	
	private boolean isWinodwInvalid(Map<Character,Integer> freqMap){

        for(int count : freqMap.values()){
            if(count>1){
                return true;
            }          
        }
        return false;
    }
    public int lengthOfLongestSubstring(String s) {
        
        Map<Character,Integer> freqMap = new HashMap<>();

        int maxLen =0;
        int left =0;

        for(int right =0;right<s.length();right++){
            char ch =s.charAt(right);
            freqMap.put(ch,freqMap.getOrDefault(ch,0)+1);


            while(isWinodwInvalid(freqMap)){
                char leftChar = s.charAt(left);
                 freqMap.put(leftChar,freqMap.get(leftChar)-1);
                if(freqMap.get(leftChar)==0){
                    freqMap.remove(leftChar);
                }
                left++;

            }

            maxLen =Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }

}
