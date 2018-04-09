package JavaEx;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		 //rite a Java program to print the area and perimeter of a rectangle
		Scanner sc =new Scanner(System.in);
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		System.out.println("Area is "+(a*b));
		System.out.println("Perimeter is "+(a+b)*2);
	}
}
