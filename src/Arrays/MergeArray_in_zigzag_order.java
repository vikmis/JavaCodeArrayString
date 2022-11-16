package Arrays;

public class MergeArray_in_zigzag_order {
	public static int [] mergeInZigZag(int a[],int b[]) {
		int c[] = new int [a.length+b.length];
		int j=0;
		int k=0;
		 for(int i =0;i<c.length;i++) {
			 if(k<a.length&&k<b.length) {
				 c[j++]=a[k];
				 c[j++]=b[k++];
			 }
			 else if(k<a.length) {
				 c[j++]=a[k++];
			 }
			 else  if(k<b.length) {
				 c[j++]=b[k++];
			 }
		 }
		 return c;
		
	}
	public static void main(String[] args) {
		int a[] = {2,5,7,8,3};
		int b[] = {1,4,0,6};
		int c[]= mergeInZigZag(a,b);
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
	}

}