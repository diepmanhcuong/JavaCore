package JavaEx;

import java.util.Arrays;
import java.util.Scanner;

public class Ex64 {

	public static void main(String[] args) {
		// Write a Java program that accepts two integer values between 25 to 75 and
		// return true if there is a common digit in both numbers. Go to the editor
		// Sample Output:

		// Input the first number : 35
		// Input the second number: 45
		// Result: true


		
		Scanner sc = new Scanner(System.in);
		boolean bl = true;
		do {
			
			System.out.println("Input the first number :");
			int a = Integer.parseInt(sc.nextLine());
			System.out.println("Input the second number:");
			int b = Integer.parseInt(sc.nextLine());
			if(a<25||a>75||b<25||b>75) {
				System.out.println("please input the number between 25 to 75!!!");
			}else {
				bl=false;
				System.out.println("result: "+result(a,b));
			}

		}while(bl);
	}
	
	public static boolean result(int a, int b) {
		int c = a/10;
		int d = a%10;
		int e = b/10;
		int f = b%10;
		if(c==e||c==f||d==e||d==f)
			return true;
		else return false;
	}

}
