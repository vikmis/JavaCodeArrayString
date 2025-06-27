package Arrays;

public class FindMaxAndMinElementInArray {
	
	public static int findSecondSmallestEleInArrray(int arr[]){
		
		int smallest =Integer.MAX_VALUE;
		int secondSmallest =Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest) {
				smallest =arr[i];
			}
			
			if(arr[i]>smallest && arr[i]<secondSmallest) {
				secondSmallest =arr[i];
			}
		}
		
		return secondSmallest;
		
	}
	
	public static void main(String[] args) {
		int [] ar = {12,54,67,89,65,55,34,23,32};
		int secondSmallest=findSecondSmallestEleInArrray(ar);
		System.out.println(secondSmallest);
		
	}

}
