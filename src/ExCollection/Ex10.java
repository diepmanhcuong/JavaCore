package ExCollection;

import java.util.ArrayList;
import java.util.Collections;

public class Ex10 {

	public static void main(String[] args) {
		// Write a Java program to shuffle elements in a array list
		ArrayList<String> color = new ArrayList<String>();
		color.add("red");
		color.add("blue");
		color.add("yellow");
		color.add("gray");
		color.add("black");
		color.add("green");
		System.out.println(color);
		Collections.shuffle(color);
		System.out.println(color);
	}

}
