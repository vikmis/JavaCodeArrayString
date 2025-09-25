package LeetCodePractice.Array;

public class LC_414_Third_Maximum_Numbe {

	
	public int thirdMax(int[] nums) {
        Long max1 = Long.MIN_VALUE;
        Long max2 = Long.MIN_VALUE;
        Long max3 = Long.MIN_VALUE;

        for ( int num : nums){
            long n = num;
            if(n == max1 || n==max2 || n==max3){
                continue;
            }
            if(n>max1){
                max3 = max2;
                max2=max1;               
                max1 =n;
            }
           else if(n>max2){

                max3 = max2;
                max2=n;

            }else if(n> max3){
                max3 =n;
            }
        }
        return (max3 == Long.MIN_VALUE) ? max1.intValue() : max3.intValue() ;
    }
}
