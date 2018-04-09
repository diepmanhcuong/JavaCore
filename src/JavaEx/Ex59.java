package JavaEx;

import java.util.Scanner;

public class Ex59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java program to convert a given string into lowercase. Go to the
		// editor
		// Sample Output:

		// Input a String: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
		// the quick brown fox jumps over the lazy dog.
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a String: ");
		String str = sc.nextLine().toUpperCase();
		System.out.println(str.toLowerCase());
	}

}
