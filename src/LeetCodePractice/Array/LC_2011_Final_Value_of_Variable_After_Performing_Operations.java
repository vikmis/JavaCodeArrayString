package LeetCodePractice.Array;

public class LC_2011_Final_Value_of_Variable_After_Performing_Operations {
	
	public static  int finalValueAfterOperations(String[] operations) {
		
		
		int X=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("--X")){
                X=X-1;
            }else if(operations[i].equals("X--")){
                X =X-1;
            }else if(operations[i].equals("X++")){
                X=X+1;
            }else{
                X=X+1;
            }

            }
            return X;
	}
	
	public static void main(String[] args) {
		String [] str = {"--X","X++","X++"};
	
		
		System.out.println(	finalValueAfterOperations(str));
	}
	

}
