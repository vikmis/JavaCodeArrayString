package LeetCodePractice.challengr75Problem;

import java.util.Stack;

public class LC_2390_Removing_Stars_From_a_String {
	
public String removeStars(String s) {
        
        Stack<Character> stack=  new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch=='*'){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        StringBuilder result = new StringBuilder();
        for(char c :stack){
            result.append(c);
        }
       return result.toString();
    }

}
