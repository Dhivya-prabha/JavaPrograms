package JavaPrograms;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {

		int[] data = { 3, 2, 1, 4, 6, 7 };

		Arrays.sort(data);

		for (int i = 1; i < data.length; i++) {
			if (i != data[i - 1]) {
				System.out.println(i);
			break;
			}
		}

	}

}
