package JavaEx;

import java.util.Scanner;

public class Ex62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the first number : ");
		int a= Integer.parseInt(sc.nextLine());
		System.out.println("Input the second number : ");
		int b= Integer.parseInt(sc.nextLine());
		System.out.println("Input the third number : ");
		int c= Integer.parseInt(sc.nextLine());
		boolean bl = true;
		if(a<=20||b<=20||c<=20) {
			System.out.println(bl);
		}else System.out.println(!bl);
	}

}
