package JavaEx;

import java.util.Scanner;

public class Ex70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java program to create a string in the form short_string +
		// long_string + short_string from two strings. The strings must not have the
		// same length. 
		// Test Data: Str1 = Python
		// Str2 = Tutorial
		// Sample Output:

		// PythonTutorialPython
		Scanner sc =new Scanner(System.in);
		System.out.println("test data: ");
		String a = sc.nextLine();
		System.out.println("the second data: ");
		String b = sc.nextLine();
		System.out.println(a+b+a);
	}

}
