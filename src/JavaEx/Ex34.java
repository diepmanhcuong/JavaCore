package JavaEx;

import java.util.Scanner;

public class Ex34 {
	public static void main(String[] args) {
		//Write a Java program to compute the area of a hexagon
		Scanner sc = new Scanner(System.in);
		float a= sc.nextFloat();
		float b = sc.nextFloat();
		System.out.println("he area of the hexagon is: "+((b*a*a)/(4*Math.tan(Math.PI/b))));
		
	}
}
