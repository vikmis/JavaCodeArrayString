package LeetCodePractice.String;

public class LC_1945_Sum_of_Digits_of_String_After_Convert {
	
	 public int getLucky(String s, int k) {
	        StringBuilder sb = new StringBuilder();
	        int sum =0;
	        for(char ch : s.toCharArray()){
	            int num = ch-'a'+1;
	            sb.append(num);
	        }
	        String newStr = sb.toString();

	        for(int i=0;i<k;i++){
	            sum=0;
	             for(char c : newStr.toCharArray()){
	             sum=sum+(c-'0');
	        }
	        newStr= String.valueOf(sum);
	        }
	       
	        return sum;
	        
	    }

}
