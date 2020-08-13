package Salesforce.practice;

import java.util.Arrays;

public class FibonacciSeries {
	public static void main(String[] args) {

		int range = 5, firstNum = 0, secNum = 1, count;
		// initialize 3 int variables (Tip: range & firstNum, secNum in the series)
		System.out.println(firstNum);
		// System.out.println(secNum);
		for (int i = 0; i <= range; i++) {
			count = firstNum + secNum;
			secNum = firstNum;
			firstNum = count;
			System.out.println(count);
		}
	}
}