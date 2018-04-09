package ExCollection;

import java.util.ArrayList;
import java.util.Collections;

public class Ex17 {

	public static void main(String[] args) {
		// Write a Java program to empty an array list
		ArrayList<String> color = new ArrayList<String>();
		color.add("red");
		color.add("blue");
		color.add("yellow");
		color.add("gray");
		color.add("black");
		color.add("green");
		System.out.println(color);
		ArrayList<String> color2 = new ArrayList<String>();
		color.removeAll(color);
		System.out.println(color);
	}

}
