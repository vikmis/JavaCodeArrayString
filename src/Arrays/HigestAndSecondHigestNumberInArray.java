package Arrays;

public class HigestAndSecondHigestNumberInArray {
	
	public static void main(String[] args) {
		
		int arr [] = {5,67,89,54,34,21,12,57};
		
		int max =Integer.MIN_VALUE;
		int min =Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		System.out.println(max+"  and   "+min);
	}

}
