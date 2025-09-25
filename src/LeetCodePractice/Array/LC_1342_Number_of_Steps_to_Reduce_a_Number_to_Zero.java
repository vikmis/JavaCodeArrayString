package LeetCodePractice.Array;

public class LC_1342_Number_of_Steps_to_Reduce_a_Number_to_Zero {
	
	 public static  int numberOfSteps(int num) {

	        int count=0;
	        while(num>0){
	            if(num%2==0){

	           num= num/2;
	           count++;
	        }else{
	            num=num-1;
	            count++;
	        }
	        }
	        
	        return count;
	    }
	 
	 public static void main(String[] args) {
		
		 int num =14;
		 
		 System.out.println(numberOfSteps(num));
		 
		 
	}

}
