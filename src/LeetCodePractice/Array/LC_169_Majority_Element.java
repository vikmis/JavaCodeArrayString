package LeetCodePractice.Array;

public class LC_169_Majority_Element {
	
public int majorityElement(int[] nums) {
        
	int count=0;
	int candidate =0;
	
	for(int num : nums) {
		
		if(count == 0) {
			candidate =num;	
			
		}
		
		count = count + ((num == candidate) ? 1 : -1);
	}
	
	count =0;
	
	for(int num : nums) {
		if(num== candidate) {
			count++;
		}
	}
	return (count > nums.length / 2) ? candidate : -1;
			
    }

}
