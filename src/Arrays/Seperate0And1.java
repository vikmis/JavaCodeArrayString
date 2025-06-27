package Arrays;

import java.util.Arrays;

public class Seperate0And1 {
	
	public static int [] seperate0And1(int [] arr) {
		
	int j =0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==0) {
				arr[j++]=arr[i];
			}
		}
		
		while(j<arr.length) {
			arr[j]=1;
			j++;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,0,0,0,1,1,0,1,0,1,1,1,1,0};
		
		int [] result =seperate0And1(arr);
		
		System.out.println(Arrays.toString(result));

}
	
}
