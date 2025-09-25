package LeetCodePractice.Array;

public class LC_905_Sort_Array_By_Parity {

	
	  public int[] sortArrayByParity(int[] nums) {
	        int[] result =new int [nums.length];
	        int k=0;
	        for(int ch :nums){
	            if(ch%2==0){
	                  result[k++]=ch;

	            }
	          
	        }
	        for(int ch :nums){
	            if(ch%2!=0){
	                  result[k++]=ch;

	            }
	          
	        }
	        return result;
	    }
}
