package Arrays.Sort;

import java.util.Scanner;

public class Sort_Array {
	 public static int [] sortArray(int a[]) {
		 int temp=0;
		 
		 for(int i=0;i<a.length;i++) {
			 for(int j=i+1;j<a.length;j++) {
				 if(a[i]>a[j]) {
					 temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;
				 }
			 }
		 }
		 return a;
	 }
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the size of array");
		//int []= sortArray(ar);
		 int size= sc.nextInt();
		 int ar []=new int[size];
		 System.out.println("Enter the Elements");
		 for(int i=0;i<ar.length;i++) {
			 ar[i]=sc.nextInt();
		 }
		 int arr[]= sortArray(ar);
		 System.out.println("Array after the sorting");
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);
		 }
	}

}
