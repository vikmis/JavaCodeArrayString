package LeetCodePractice.Array;

public class LC_1295_Find_Numbers_with_Even_Number_of_Digits {
	
	public int findNumbers(int[] nums) {

        int count=0;
        int finCount =0;
        for(int i=0;i<nums.length;i++){

            while(nums[i]>0){
                nums[i]= nums[i]/10;
            count++;

            }          

            if(count%2==0){
                finCount++;
               
            }
            count=0;
             
        }
        return finCount;
    }

}
