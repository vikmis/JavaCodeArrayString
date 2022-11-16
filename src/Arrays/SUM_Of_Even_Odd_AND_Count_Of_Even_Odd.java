package Arrays;

import java.util.Arrays;

public class SUM_Of_Even_Odd_AND_Count_Of_Even_Odd {

	public static void main(String[] args) {

		int m = 3, n = 3;
		int array[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		frquencyAndSumOfEvenOdd(array, m, n);
		System.out.println(Arrays.deepToString(array));

	}
	public static void frquencyAndSumOfEvenOdd(int a[][],int m, int n) {
		int even=0,odd=0,sum_even=0,sum_odd=0;
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(a[i][j]%2==0) {
					even++;
					sum_even=sum_even+a[i][j];
				}else {
					odd++;
					sum_odd=sum_odd+a[i][j];
				}
			}
		}
		System.out.println("Frequncy of even number "+even);
		System.out.println("Frequncy of odd number "+odd);
		System.out.println("Sum of even number "+sum_even);
		System.out.println("Sum of odd number "+sum_odd);
		
	}

}
