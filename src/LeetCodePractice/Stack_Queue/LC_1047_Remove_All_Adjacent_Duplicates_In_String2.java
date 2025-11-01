package LeetCodePractice.Stack_Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class LC_1047_Remove_All_Adjacent_Duplicates_In_String2 {

	
public String removeDuplicates(String s) {
        
        Deque<Character> stack = new ArrayDeque<>();
        for(char ch : s.toCharArray()){
            if(!stack.isEmpty() && ch==stack.peek()){
                stack.pop();
            }else{
                     stack.push(ch);
            }
            
        }
       StringBuilder sb = new StringBuilder();
       while(!stack.isEmpty()){
        sb.append(stack.pop());
       }

       return sb.reverse().toString();
    }
}
