package week2Day2;

public class ReverseString {

	public static void main(String[] args) {
		//PseudoCode 1
		String test="feeling good";
		char[] charArray = test.toCharArray();
		for(int i=charArray.length-1;i>=0;i--) {
			System.out.print(charArray[i]);
		}
		//PseudoCode 2
		String test1="feeling good";
		int length = test1.length();
		for(int j=length-1;j>=0;j--) {
			System.out.print("\n"+test.charAt(j));
		}
	}

}
