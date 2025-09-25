package LeetCodePractice.TwoPointerPattern;

public class LC_125_ValidPalindrome {
	
	public boolean isPalindrome(String s) {
		
		char[] ch =s.toCharArray();
		
		int left =0;
		int right = ch.length-1;
		
		while(left<right) {
			
			if(!Character.isLetterOrDigit(ch[left])) {
				left++;
			}else if (!Character.isLetterOrDigit(ch[right])) {
				right--;
			}
			else if(Character.toLowerCase(ch[left])==Character.toLowerCase(ch[right])) {
				left++;
				right--;
			}else {
				return false;
			}
		}
		
		
	return true;
		
		
	}
	
	
	public static void main(String[] args) {
		
		String Input = "A man, a plan, a canal: Panama";
		
		LC_125_ValidPalindrome vp = new LC_125_ValidPalindrome();
		
		 boolean result =vp.isPalindrome(Input);
		 
		 System.out.println(result);
	}

}
