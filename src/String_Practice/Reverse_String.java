package String_Practice;

import java.util.Scanner;

public class Reverse_String {
	
	public static String  reverseString(String str){
		String s ="";
		for(int i=str.length()-1;i>=0;i--) {
			s= s+str.charAt(i);
		}
		return s;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s =sc.next();
		String str =reverseString(s);
		System.out.println("Reversed String is "+str);
	}

}
