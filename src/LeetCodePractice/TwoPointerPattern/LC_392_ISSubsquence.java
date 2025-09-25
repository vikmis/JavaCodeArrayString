package LeetCodePractice.TwoPointerPattern;

public class LC_392_ISSubsquence {
	
	public boolean isSequence(String s,String t) {
		
		int i =0;
		int j=0;
		
		while(i<s.length() && j<t.length()) {
			
			if(s.charAt(i)==t.charAt(j)) {
				i++;
			}
			j++;
		}
		return i==s.length();
	}
	
	public static void main(String[] args) {
		
		String s = "axc";
		String t="ahbgdc";
		LC_392_ISSubsquence isSeq = new LC_392_ISSubsquence();
		
		
		
		System.out.println(isSeq.isSequence(s, t));
	}

}
