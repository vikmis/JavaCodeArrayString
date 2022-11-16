package Arrays;
 import java.util.*;

public class Read_the_user_array {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Array size");
		int size = sc.nextInt();
		int [] ar = new int[size];
		System.out.println("enter the "+size+"elements");
		for(int i =0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		System.out.println("The elements you entered in array");
		for(int i =0;i<ar.length;i++) {
			System.out.println("the index number "+i+"---"+ar[i]);
		}
			  
	}

}
