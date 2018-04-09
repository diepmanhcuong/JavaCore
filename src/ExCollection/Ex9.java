package ExCollection;

import java.util.ArrayList;
import java.util.Collections;

public class Ex9 {
	// Write a Java program to copy one array list into another
	public static void main(String[] args) {
		ArrayList<String> color = new ArrayList<String>();
		color.add("red");
		color.add("blue");
		color.add("yellow");
		color.add("gray");
		color.add("black");
		color.add("green");
		ArrayList<String> color2 = new ArrayList<String>();
		color2.add("l");
		color2.add("b");
		color2.add("y");
		color2.add("g");
		color2.add("b");
		color2.add("g");
		
		Collections.copy(color, color2);
		System.out.println("" + color);
		//copy thì phải cùng số phần tử
	}
}
