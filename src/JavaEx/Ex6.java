package JavaEx;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		//Write a Java program to print the sum (addition), 
		//multiply, subtract, divide and remainder of two numbers
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a+" + "+b+ "= "+(a+b));
		System.out.println(a+" - "+b+ "= "+(a-b));
		System.out.println(a+" * "+b+ "= "+(a*b));
		System.out.println(a+" / "+b+ "= "+(a/b));
		System.out.println(a+" % "+b+ "= "+(a%b));
	}
}
