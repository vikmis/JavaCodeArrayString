package LeetCodePractice.challengr75Problem;

public class LC_1768_Merge_Strings_Alternately {
	
	public String mergeAlternately(String word1, String word2) {
        char ch1[] = word1.toCharArray();
        char ch2[] = word2.toCharArray();
         int i=0;
         int j=0;
         int k=0;
         char result []= new char [ch1.length+ch2.length];

         while(i<ch1.length && j<ch2.length){
            result[k++]=ch1[i++];
            result[k++]=ch2[j++];
         }
         while(i<ch1.length){
            result[k++]=ch1[i++];
         }
          while(j<ch2.length){
            result[k++]=ch2[j++];
         }
         return new String(result);
    }

}
