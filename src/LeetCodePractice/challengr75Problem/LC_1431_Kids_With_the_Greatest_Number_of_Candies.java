package LeetCodePractice.challengr75Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_1431_Kids_With_the_Greatest_Number_of_Candies {
	
	 public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

	        List<Boolean> list =new ArrayList<>();
	        int maxCandy =0;
	        for(int candy : candies) {
	        	if(candy>maxCandy) {
	        		maxCandy= candy;
	        	}
	        }
	        
	        for(int candy : candies) {
	        	list.add(candy+extraCandies>=maxCandy);
	        }
	        return list;
	    }
	 
	 public static void main(String[] args) {
		
		 int[] candies= {2,3,5,1,3};
		 int extraCandies=3;
	
		 List<Boolean> list = kidsWithCandies(candies,extraCandies);
		 
		 System.out.print(list);
		
		 
		 
	}

}
