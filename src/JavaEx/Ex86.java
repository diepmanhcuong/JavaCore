package JavaEx;

import java.util.Scanner;

public class Ex86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java program start with an integer n, divide n by 2 if n is even or
		// multiply by 3 and add 1 if n is odd, repeat the process until n = 1
		int ctr = 0;
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while (n != 1) {
		    System.out.println(n);
			if (n % 2 == 0) {
				n = n / 2;
				ctr += 1;
			}
			else {
				n = (3 * n + 1) / 2;
				ctr += 1;
			}
		}
		System.out.println(ctr);
		in.close();
	}

}
