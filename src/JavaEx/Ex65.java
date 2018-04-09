package JavaEx;

import java.util.Scanner;

public class Ex65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java program to calculate the modules of two numbers without using
		// any inbuilt modulus operator. Go to the editor
		// Sample Output:

		// Input the first number : 19
		// Input the second number: 7
		// 5
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input the first number: ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("input the second number: ");
		int b = Integer.parseInt(sc.nextLine());
		System.out.println(a%b);
	}

}
