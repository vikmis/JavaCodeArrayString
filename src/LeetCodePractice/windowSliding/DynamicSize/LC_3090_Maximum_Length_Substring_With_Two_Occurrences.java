package LeetCodePractice.windowSliding.DynamicSize;

import java.util.HashMap;
import java.util.Map;

public class LC_3090_Maximum_Length_Substring_With_Two_Occurrences {
	
public int maximumLengthSubstring(String s) {
        
        Map<Character ,Integer> freq = new HashMap<>();

        int left =0;
        int maxLength=0;

        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);
            freq.put(ch,freq.getOrDefault(ch,0)+1);

            while(isWindowInvalid(freq)){
                char leftChar = s.charAt(left);
                freq.put(leftChar,freq.get(leftChar)-1);
                if(freq.get(leftChar)==0){
                    freq.remove(leftChar);
                }
                left++;
            }
            maxLength = Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }

    private boolean isWindowInvalid(Map<Character,Integer> freq){
        for(int count : freq.values()){
            if(count>2){
                return true;
            }
        }
        return false;
    }

}
