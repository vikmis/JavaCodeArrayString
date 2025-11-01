package LeetCodePractice.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_1431_Kids_With_the_Greatest_Number_of_Candies2 {
	
	 public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

	        List<Boolean> list =new ArrayList<>();
	        
	        int count=0;
	        for(int i=0;i<candies.length;i++){

	            for(int j=0;j<candies.length;j++){
	                if(candies[i]+extraCandies>=candies[j] ){
	                    count++;
	                }                
	            }
	             if(count==candies.length){

	                   list.add(true);
	                }else{
	                     list.add(false);
	                }
	             count=0;
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
