package JavaEx;

import java.util.Scanner;

public class Ex35 {
	public static void main(String[] args) {
		// Write a Java program to compute the area of a polygon
		Scanner sc = new Scanner(System.in);
		float a= sc.nextFloat();
		System.out.println("he area of the polygon is: "+((6*a*a)/(4*Math.tan(Math.PI/6))));
	}
}
