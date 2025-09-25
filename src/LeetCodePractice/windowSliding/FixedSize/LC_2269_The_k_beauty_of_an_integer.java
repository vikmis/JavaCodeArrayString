package LeetCodePractice.windowSliding.FixedSize;

public class LC_2269_The_k_beauty_of_an_integer {
	
	public static  int divisorSubstrings(int num, int k) {

        // Convert number to string for substring operations
        String strNum = Integer.toString(num);
        int count = 0;

        // Iterate over all possible substrings of length k
        for (int i = 0; i <= strNum.length() - k; i++) {

            // Extract substring of length k
            String subStr = strNum.substring(i, i + k);

            // Convert substring to integer
            int n = Integer.parseInt(subStr);

            // Skip if substring value is 0 (0 cannot divide any number)
            if (n == 0) continue;

            // Check if num is divisible by this substring
            if (num % n == 0) {
                count++;
            }
        }
        return count;
    }
	
	public static void main(String[] args) {
		
		int num =240;
		int k=2;
		
		
		
		System.out.println(divisorSubstrings(num,k));
		
	}

}
