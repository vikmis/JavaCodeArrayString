package LeetCodePractice.BinearySearch;

public class LC_74_Search_a_2D_Matrix {
	
public boolean searchMatrix(int[][] matrix, int target) {
        
        int m =matrix.length;
        int n = matrix[0].length;

        int start =0,end =m*n-1;

        while(start<=end){
            int mid =start+(end-start)/2;

            int row =mid/n;
            int col = mid%n;

            int midVal =matrix[row][col];

            if(midVal== target){
                return true;
            }else  if (midVal<target){
                start = mid+1;
            }else{
                end=mid-1;
            }
        }
return false;
    }

}
