package JavaEx;

import java.util.Scanner;

public class Ex53 {
	public static void main(String[] args) {
		// Write a Java program that accepts three integers from
		// the user and return true if the second number is greater than first number
		// and third number is greater than second number.
		// If "abc" is true second number does not need to be greater than first number.
		// Sample Output:

		// Input the first number : 5
		// Input the second number: 10
		// Input the third number : 15
		// The result is: true

		Scanner sc = new Scanner(System.in);
		System.out.println("Input the first number : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("Input the second number : ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.println("Input the third number : ");
		int num3 = Integer.parseInt(sc.nextLine());
		boolean bl = true;
		if (num1 < num2 && num2 < num3) {
			System.out.println("The result is: " + bl);
		} else
			System.out.println("The result is: " + !bl);
	}

}
