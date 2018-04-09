package JavaEx;

import java.util.Scanner;

public class Ex68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java program to create a new string of 4 copies of the last 3
		// characters of the original string. The length of the original string must be
		// 3 and above. r
		// Sample Output:

		// 3.03.03.03.0
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String last_three_chars = a.substring(a.length() - 3);
		System.out.println(last_three_chars+last_three_chars+last_three_chars+last_three_chars);
	}

}
