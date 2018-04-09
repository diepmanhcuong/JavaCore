package JavaEx;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		//Write a Java program to print the area and perimeter of a circle.
		Scanner sc =new Scanner(System.in);
		float radius = sc.nextInt();
		System.out.println("Area is "+(radius*2*Math.PI));
		System.out.println("perimeter is "+(radius*radius*Math.PI));
	}
}
