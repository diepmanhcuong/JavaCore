package JavaEx;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		//Write a Java program to swap two variables
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b = sc.nextInt();
		int c = a;
		a= b;
		b=c;
		System.out.println(a);
		System.out.println(b);
	}
}
