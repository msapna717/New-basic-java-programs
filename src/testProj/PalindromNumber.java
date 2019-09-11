package testProj;

import java.util.Scanner;

public class PalindromNumber {
	static int reverse = 0;
	static int number, n;
	static int temp;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input number: ");
		number = in.nextInt();
		System.out.println("You have entered number:" + number);
		reverseNumber();
		IsPalindromNumbers();

	}

	static void reverseNumber() {
		n = number;
		while (n > 0) {
			temp = n % 10;
			n = n / 10;
			reverse = (reverse * 10) + temp;
		}
	}

	public static void IsPalindromNumbers() {
		System.out.println("Reverse of " + number + " is: " + reverse);
		if (number == reverse) {
			System.out.println(number + " is palidrome number");
		} else {
			System.out.println(number + " is not palidrome number");
		}

	}
}
