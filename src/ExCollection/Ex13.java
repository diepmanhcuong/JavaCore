package ExCollection;

import java.util.ArrayList;
import java.util.Collections;

public class Ex13 {

	public static void main(String[] args) {
		// Write a Java program to compare two array lists
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
		ArrayList<String> color3 = new ArrayList<String>();
		for (String string : color2) {
			color3.add(color.contains(string)?"yes":"no");
		}System.out.println(color3);
	}

}
