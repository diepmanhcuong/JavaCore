package JavaEx;

import java.util.Scanner;

public class Ex69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("input string: ");
		String a = sc.nextLine();
		String b = a.substring(0, a.length()/2);
		System.out.println(b);
	}

}
