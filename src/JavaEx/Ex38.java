package JavaEx;

import java.util.Scanner;

public class Ex38 {

	public static void main(String[] args) {
		//Write a Java program to count the letters, spaces, 
		//numbers and other characters of an input string. Go to the editor
		//Expected Output

		//The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
		//letter: 23                                               
		//space: 9                                                 
		//number: 10                                               
		//other: 6
		
		Scanner sc = new Scanner(System.in);
		char[] lt = sc.nextLine().toCharArray();
		int ch=0,space=0,num=0,other=0;
		for(int i = 0;i<lt.length;i++) {
			if(Character.isLetter(lt[i])) {
				ch++;
			}else if(Character.isDigit(lt[i])) {
				num++;
			}else if(Character.isSpaceChar(lt[i])) {
				space++;
			}else {
				other++;
			}
		}
		System.out.println("letter: "+ch);
		System.out.println("space: "+space);
		System.out.println("num: "+num);
		System.out.println("other: "+other);

	}
}
