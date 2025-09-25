package LeetCodePractice.String;

public class LC_1221_Split_a_String_in_Balanced_Strings {

	 public static int balancedStringSplit(String s) {
		 
		 int balance=0;
		 int count=0;
		 
		 for(char ch : s.toCharArray()) {
			 if(ch=='R') {
				 balance++;
			 }else {
				 balance--;
			 }
			 if(balance==0) {
				 count++;
			 }
		 }
		 return count;
	 }
	 public static void main(String[] args) {
		 String s= "RLRRLLRLRL";
		System.out.println( balancedStringSplit(s));
	}
}
