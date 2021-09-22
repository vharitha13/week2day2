package week2Day2;

public class PalindromeString {

	public static void main(String[] args) {
		String str = "kayak";
		String rev = "";
		for (int i = str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
	}
		
		if(rev.equals(str)) {
			System.out.println("String is a palidrome:"+rev);
		}
		else
			System.out.println("String is not a palindrome:"+rev);
}
}