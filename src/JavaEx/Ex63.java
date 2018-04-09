package JavaEx;

import java.util.Scanner;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

public class Ex63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java program that accepts two integer values from the user and return
		// the larger values. However if the two values are the same, return 0 and
		// return the smaller value if the two values have the same remainder when
		// divided by 6. Go to the editor
		// Sample Output:

		// Input the first number : 12
		// Input the second number: 13
		// Result: 13

		Scanner sc = new Scanner(System.in);
		System.out.println("Input the first number: ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("Input the second number: ");
		int b = Integer.parseInt(sc.nextLine());
		System.out.println("result: "+result(a,b));
	}
	public static int result(int a, int b) {
		int c= a%6;
		int d = b%6;
		if(a>b) {
			if(c==d) {
				return b;
			}else return a;
		}else if(b>a) {
			if(c==d) {
				return a;
			}else return b;
			
		}else  
			return 0;
	}

}
