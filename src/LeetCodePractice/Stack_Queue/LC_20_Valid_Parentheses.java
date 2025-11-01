package LeetCodePractice.Stack_Queue;

import java.util.Stack;

public class LC_20_Valid_Parentheses {
	
	 public boolean isValid(String s) {

	        Stack<Character> stack= new Stack<>();
	       
	       for(char ch : s.toCharArray()){
	            if(ch=='('){
	                stack.push(')');
	            }else if (ch=='{'){
	                 stack.push('}');
	            }else if(ch=='['){
	                 stack.push(']');
	            }
	            
	            else{                
	                if(stack.isEmpty()||stack.pop()!=ch){
	                    return false;
	                }           
	            }
	       }
	   return stack.isEmpty();
	    }
}
