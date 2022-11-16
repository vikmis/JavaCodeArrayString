package String_Practice;

public class Number_Of_Occurance {
	
	static void string_Occurance(String str) {
		char [] ch =str.toCharArray();
		int [] frequency =new int[str.length()];
		for(int i=0;i<str.length();i++) {
			frequency[i]=1;
			for(int j=i+1;j<str.length();j++) {
				if(ch[i]==ch[j]) {
					frequency[i]++;
					ch[j]='0';
				}
			}
		}
		for(int i=0;i<frequency.length;i++) {
			if(ch[i] != ' ' && ch[i] != '0') {
			System.out.println(ch[i]+" - "+frequency[i]);
			}
		}
	}
	public static void main(String[] args) {
		String str ="picture perfect";
		string_Occurance(str);
	}

}
