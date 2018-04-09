package JavaEx;

import java.util.Scanner;

public class Ex37 {
	public static void main(String[] args) {
		//Write a Java program to reverse a string. Go to the editor
		//Input Data:
		//Input a string: The quick brown fox 
		//Expected Output
		//Reverse string: xof nworb kciuq ehT
		Scanner sc = new Scanner(System.in);
		System.out.println("input to string: ");
		char[] letter = sc.nextLine().toCharArray();
		for(int i=letter.length -1;i>=0;i--) {
			System.out.print("Reverse string: "+letter[i]);
		}
	}
}
