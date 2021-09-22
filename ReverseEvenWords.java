package week2Day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";

		String[] split = test.split(" ");

		for (int i = 0; i < split.length; i++) {
			if (i % 2 == 0) {
				System.out.println(split[i]);
			} else {
				char[] arr = split[i].toCharArray();
				System.out.println(" ");
				for (int j = arr.length - 1; j >= 0; j--) {
					System.out.println(arr[j] + "");
				}
			}
		}
	}
}
