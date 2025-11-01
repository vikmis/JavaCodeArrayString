package LeetCodePractice.challengr75Problem;

public class LC_605_Can_Place_Flowers {
	
	 public boolean canPlaceFlowers(int[] flowerbed, int n) {

	       int m = flowerbed.length;

	        for(int i =0;i<m && n>0;i++){

	            if(flowerbed[i]==1){
	        continue;
	       }

	           boolean leftSide= ((i==0) || (flowerbed[i-1]==0));
	           boolean rigthSide =((i==m-1) || (flowerbed[i+1]==0));

	            if(leftSide && rigthSide){
	                flowerbed[i]=1;
	                n--;
	                
	            }
	        }
	        return n<=0;
	    }
}
