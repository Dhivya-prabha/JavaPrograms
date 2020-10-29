package sample;

public class ReverseEvenWords {
	public static void main(String[] args) {

		String s1 = "I am a software tester";

		String[] words = s1.split(" ");

		for (int i = 0; i < words.length; i++) {

			if (i % 2 == 1) {

				char[] temp = words[i].toCharArray();
				for (int j = temp.length - 1; j >= 0; j--) {
					System.out.print(temp[j]);
				}
				System.out.print(" ");
			} else {
				System.out.print(words[i] + " ");
			}
		}

	}
}
