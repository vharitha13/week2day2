package week2Day2;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		String text = "Tes12Le79af65";
		int sum = 0;
		String replace1 = text.replaceAll("[\\D]", "");
		System.out.println("Replaced text:" + replace1);
		char[] cs = replace1.toCharArray();
		for (int i = 0; i < cs.length; i++) {
			int numericValue = Character.getNumericValue(cs[i]);
			sum = sum + numericValue;
		}
		System.out.println("Sum is:" + sum);
	}
}
