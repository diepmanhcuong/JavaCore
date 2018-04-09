package JavaEx;

import java.util.Scanner;

public class Ex36 {
	public static void main(String[] args) {
		// Write a Java program to compute the distance between two points on the surface of earth
		Scanner sc = new Scanner(System.in);
		double x1= sc.nextDouble();
		double y1= sc.nextDouble();
		
		double x2= sc.nextDouble();
		double y2= sc.nextDouble();
		final double r = 6371.01f;
		double d = r * Math.acos(Math.sin(x1)* Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));
		System.out.println("The distance between those points is: "+d);
	}
}
