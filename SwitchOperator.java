package Salesforce.practice;

public class SwitchOperator {
	public static void main(String[] args) {

		int a = 5;
		int b = 4;
		int option = 2;

		switch (option) {
		case 1:
			System.out.println("Addition is: " + (a + b));
			break;
		case 2:
			System.out.println("Substraction is: " + (a - b));
			break;
		case 3:
			System.out.println("Division is: " + (a / b));
			break;
		case 4:
			System.out.println("Multiplication is: " + (a * b));
			break;

		}
	}
}