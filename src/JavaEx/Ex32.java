package JavaEx;

import java.util.Scanner;

public class Ex32 {
	public static void main(String[] args) {
		//Write a Java program to compare two numbers.
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b = sc.nextInt();
		if(a<b) {
			System.out.println(a+" < "+b);
			System.out.println(a+" <= "+b);
			System.out.println(a+" != "+b);
		}else if(a>b){
			System.out.println(a+" > "+b);
			System.out.println(a+" >= "+b);
			System.out.println(a+" != "+b);
		}else {
			System.out.println(a+" = "+b);
		}
	}
}
