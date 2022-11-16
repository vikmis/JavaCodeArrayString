package Arrays;

public class Sorting_Two_Array {

	public static int[] sortTwoArray(int a[], int b[]) {
		 int c[]=new int [a.length+b.length];
		 int i=0,j=0,k=0;
		 while(i<a.length&&j<b.length) {
			 c[k++]=a[i]<b[j]?a[i++]:b[j++];
		 }
		 while(i<a.length) {
			 c[k++]=a[i++];
		 }
		 while(j<b.length) {
			 c[k++]=b[j++];
		 }
		 for(int x=0;x<c.length;x++) {
			 int temp =0;
			 for(int y=x+1;y<c.length;y++) {
				 if(c[x]>c[y]) {
					 temp=c[x];
					 c[x]=c[y];
					 c[y]=temp;
				 }
			 }
			 
		 }
		 return c;
	}
	public static void main(String[] args) {
		int [] a= {3,8,90,-12,40};
		int [] b= {-2,22,67,90,81,34,1};
		
		int ar[]=sortTwoArray(a,b);
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
	}
}
