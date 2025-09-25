package LeetCodePractice.String;

public class LC_459_Repeated_Substring_Pattern {

public boolean repeatedSubstringPattern(String s) {
        
        int n = s.length();
        int lps [] = new int[s.length()];
        int i=1;
        int len =0;

        while(i<n){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }else{
                if(len!=0){
                    len =lps[len-1];
                }else{
                    lps[i]=0;
                    i++;
                }
            }
        }
          int longestPrefixSuffix = lps[n - 1];
          return (longestPrefixSuffix>0 && n%(n-longestPrefixSuffix)==0);
    }
	
}
