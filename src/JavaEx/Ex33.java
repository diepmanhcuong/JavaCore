package JavaEx;

import java.util.Scanner;

public class Ex33 {
	public static void main(String[] args) {
		//Write a Java program and compute the sum of the digits of an integer.
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int sum =0;
		while(a!=0) {
			sum+=(a%10);
			a/=10;
		}System.out.println(sum);
	}
}
