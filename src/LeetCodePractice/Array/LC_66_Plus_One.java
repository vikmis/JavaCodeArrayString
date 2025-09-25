package LeetCodePractice.Array;

import java.util.ArrayList;
import java.util.List;

public class LC_66_Plus_One {
	
	public int [] plusOne(int[] digits) {
        int num =0;
        List<Integer> list = new ArrayList<> ();

        for(int i=0;i<digits.length;i++){

            num = num*10+digits[i];
        }

       String theFinalNostr =Integer.toString(num+1);

        char ch[] =theFinalNostr.toCharArray();

        for(int i =0;i<ch.length;i++){ 
            list.add( Integer.parseInt( String.valueOf( ch[i])));
        }
        int[] intArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            intArray[i] = list.get(i); 
        }
        return intArray;
    }

}
