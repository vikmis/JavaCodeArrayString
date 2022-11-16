package String_Practice;

import java.util.Arrays;

public class Check_String_is_AnagramORNot {
	
	static String isAngram(String str1,String str2) {
		
		str1 =str1.toLowerCase();
		str2 =str2.toLowerCase();
		
		char [] string1=str1.toCharArray();
		char [] string2 =str2.toCharArray();
		if(string1.length!=string2.length) {
			return "String is not anagram";
		}else {
			
			Arrays.sort(string1);
			Arrays.sort(string2);
			if(Arrays.equals(string1, string2)) {
				return "String is anagram";
			}
			
			
		}	
		
		
		return "String is not anagram";
	
	}
	public static void main(String[] args) {
		String s=isAngram("Brag","Grab");
		System.out.println(s);
	}

}
