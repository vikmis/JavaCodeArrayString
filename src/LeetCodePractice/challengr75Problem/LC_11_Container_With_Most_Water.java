package LeetCodePractice.challengr75Problem;

public class LC_11_Container_With_Most_Water {
	
public int maxArea(int[] height) {
        
        int left =0;
        int right =height.length-1;
        int maxArea = 0;

        while(left<right){
           int width =right-left;

           int area = ((width)*Math.min(height[left],height[right]));
           maxArea = Math.max(area,maxArea);

            if(height[left]<height[right]){
            left++;
        }else{
            right--;
        }

        }
        
        return maxArea;
}

}
