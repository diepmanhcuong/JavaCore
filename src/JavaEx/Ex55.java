package JavaEx;

import java.util.Scanner;

public class Ex55 {

	public static void main(String[] args) {
		// Write a Java program to convert seconds to hour, minute and seconds.
		// Sample Output:

		// Input seconds: 86399
		// 23:59:59
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the seconds: ");
		int num = Integer.parseInt(sc.nextLine());
		int hh=num/3600;
		num%=3600;
		int mm = num/60;
		int ss = num%60;
		if(hh>23) {
			hh%=24;
		}
		System.out.println(hh+":"+mm+":"+ss);
		
	}

}
