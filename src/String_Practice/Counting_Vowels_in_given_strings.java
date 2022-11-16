package String_Practice;

import java.util.Scanner;

public class Counting_Vowels_in_given_strings {
	
	public static String count_Vowels(String str){
		String s ="";
		for(int i=0;i<str.length();i++) {
			
			char ch =str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					s =s+" "+String.valueOf(ch);	
			}
		}
		return s;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string ");
		String str =sc.nextLine();
		String s =count_Vowels(str);
		System.out.println(s);
	}

}
