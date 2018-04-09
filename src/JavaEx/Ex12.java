package JavaEx;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		//Write a Java program that takes three numbers 
		//as input to calculate and print the average of the numbers
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println((float)(a+b+c));
	}
}
