package LeetCodePractice.Array;

public class LC_1108_Defanging_an_IP_Address {
	
	 public static  String defangIPaddr(String address) {

	        StringBuilder strbuild = new StringBuilder();

	        for(int i=0;i<address.length();i++)
	        {
	            if(address.charAt(i)=='.'){	
	             strbuild=strbuild.append("[")
	             .append(address.charAt(i)).append("]");
	        }else{
	           // str=str+address.charAt(i);
	           strbuild=strbuild.append(address.charAt(i));
	        }
	        }
	        return strbuild.toString();
	    }
	 
	 public static void main(String[] args) {
		
		 String address ="1.1.1.1";
		
		 System.out.println( defangIPaddr(address));
		 
	}

}
