package LeetCodePractice.TwoPointerPattern;

public class LC_11_ContainerWithMostWater {

	public static void main(String[] args) {
	
		  int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
	        int result = maxArea(height);
	        System.out.println(result); // Output: 49
		
		
	}
	
	public static int maxArea(int height []) {
		
		int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            // Calculate current area
            int currentHeight = Math.min(height[left], height[right]);
            int width = right - left;
            int currentArea = currentHeight * width;

            // Update maxArea
            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer pointing to the shorter line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
        
	}

}
