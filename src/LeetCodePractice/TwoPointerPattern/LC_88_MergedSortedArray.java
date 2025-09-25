package LeetCodePractice.TwoPointerPattern;

public class LC_88_MergedSortedArray {
	
	public int[] mergeSortedArray(int [] num1,int m, int[] num2,int n) {
		
		int i =0 ; 
		int j=0; 
		int k=0;
		int result [] = new int[m+n];
		
		while(i<m && j<n) {
			
			if(num1[i]>num2[j]) {
				result[k++]=num2[j++];
			}else {
				result[k++]=num1[i++];
			}
		}
		while(i<m) {
			result[k++]=num1[i++];
		}
		while(j<n) {
			result[k++]=num2[j++];
		}
		return result;
	
	}
	
	public static void main(String [] arg) {
		
		int num1[] = {1,2,3,0,0,0};
		int num2[]= {2,5,6};
		int m=3;
		int n = num2.length;
		
		LC_88_MergedSortedArray  msa = new LC_88_MergedSortedArray();
		
		int [] finalArray =msa.mergeSortedArray(num1, m, num2, n);
		
		for (int i=0;i<finalArray.length;i++) {
			
			System.out.print( finalArray[i]);
		}
		
		
	}
		
}
