package sample;

public class ReverseEvenWordBuilder {
	public static void main(String[] args) {
		String str = "Welcome to Chennai City";
		String[] eachWord = str.split(" ");

		for (int i = 0; i < eachWord.length; i++) {
			if (i % 2 == 1) {
				String word = eachWord[i] + "";
				StringBuilder builder = new StringBuilder(word);
				StringBuilder reverse = builder.reverse();
				System.out.print(reverse + " ");
			} else {
				System.out.print(eachWord[i] + " ");
			}
		}

	}

}