package LeetCodePractice.windowSliding.FixedSize;

public class LC_2379_Minimum_Recolors_to_Get_K_Consecutive_Black_Blocks {
	
	public int minOperation(String blocks, int k) {
		
	
		int whiteCount=0;
		
		for(int i=0;i<k;i++) {
			if(blocks.charAt(i)=='W') {
				whiteCount++;
			}
		}
		
		int minOperation = whiteCount ;
		
		for(int i=k;i<blocks.length();i++) {
			if(blocks.charAt(i-k)=='W') {
				whiteCount--;
			}
			
			if(blocks.charAt(i)=='W') {
				whiteCount++;
			}
			minOperation = Math.min(minOperation, whiteCount);
		}
		
		return minOperation;
		
		
	}
	public static void main(String[] args) {
		
		String str ="WBBWWBBWBW";
		int k=7;
		
		LC_2379_Minimum_Recolors_to_Get_K_Consecutive_Black_Blocks refvar = new  LC_2379_Minimum_Recolors_to_Get_K_Consecutive_Black_Blocks();
		
		System.out.println(refvar.minOperation(str, k));
	}

}

