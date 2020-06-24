package test;

import java.util.LinkedHashSet;
import java.util.Set;


public class PaypalSet {

	public static void main(String[] args) {
		// Declare a String as PayPal India
		String text = "PayPal India";

		String text1 = text.replaceAll("\\s", "");
		// Convert it into a character array
		char[] charArray = text1.toCharArray();
		// Declare a Set as charSet for Character
		Set<Character> charSet = new LinkedHashSet<Character>();
	
		Set<Character> dupCharSet = new LinkedHashSet<Character>();

		for (char c : charArray) {
			boolean add = charSet.add(c);
			// if the character is already in the charSet then, add it to the dupCharSet
			if (add == false) {

				dupCharSet.add(c);

			}

		}

		System.out.println("The Duplicate Characters :" + dupCharSet);
		// Check the dupCharSet elements and remove those in the charSet
		charSet.removeAll(dupCharSet);

		System.out.println("The Character Set after removing Duplicates :" + charSet);

	}

}
