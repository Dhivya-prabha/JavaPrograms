package Assignaments;

public class RemoveDuplicateWords {
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";

		int count = 0;

		String temp = null;

		String[] wordsArr = text.split(" ");

		for (int i = 0; i < wordsArr.length - 1; i++) {
			for (int j = i; j < wordsArr.length - 1; j++) {
				if (wordsArr[i].equals(wordsArr[j])) {
					temp = wordsArr[i];
					count += 1;
				}
			}
		}

		if (count > 1) {
			System.out.println(text.replace(temp, ""));
		}

	}

}