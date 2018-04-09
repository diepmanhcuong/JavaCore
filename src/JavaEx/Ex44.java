package JavaEx;

import java.util.Scanner;

public class Ex44 {

	public static void main(String[] args) {
		//Write a Java program that accepts an integer (n) and computes the value of 
		//n+nn+nnn. 
		//Sample Output:
		//Input number: 5                                                        
		//5 + 55  + 555
		Scanner sc =new Scanner(System.in);
		System.out.println("input number: ");
		int num = Integer.parseInt(sc.nextLine());
		System.out.println(num+" + "+num+""+num+" + "+num+""+num+""+num);
	}

}
