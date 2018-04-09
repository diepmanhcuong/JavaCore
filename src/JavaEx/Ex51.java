package JavaEx;

import java.util.Scanner;

public class Ex51 {

	public static void main(String[] args) {
		//Write a Java program to convert a string to an integer in Java. Go to the editor
		//Sample Output:			
		//Input a number(string): 25                                             
		//The integer value is: 25	
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number(string): ");
		String st = sc.nextLine();
		int num = Integer.parseInt(st);
		System.out.println("The integer value is: "+num);
	}

}
