package LeetCodePractice.TwoPointerPattern;




import java.util.*;

public class LC_283_MoveZero {
	
	public int [] moveZerorightside(int [] nums){
		
		
	int insertPosition=0;

		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=0){
				nums[insertPosition++]=nums[i];
			}
		}
		for(int j=insertPosition;j<nums.length;j++) {
			nums[j] =0;
		}
		return nums;
	}
	
	public static void main(String[] args) {
		int nums [] = {0,1,0,3,12};
		LC_283_MoveZero mz =new LC_283_MoveZero();
		mz.moveZerorightside(nums);
		System.err.println(Arrays.toString(nums));
		
	}

}

	