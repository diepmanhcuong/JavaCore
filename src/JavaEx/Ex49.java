package JavaEx;

import java.util.Scanner;

public class Ex49 {

	public static void main(String[] args) {
		// Write a Java program to accept a number and check the number is even or not. 
		//Prints 1 if the number is even or 0 if the number is odd. 
		//Sample Output:
		//Input a number: 20                                                     
		//1
		Scanner sc = new Scanner(System.in);
		System.out.println("input a number: ");
		int num = Integer.parseInt(sc.nextLine());
		if(num%2==0) {
			System.out.println("1");
		}else System.out.println("0");
	}

}
