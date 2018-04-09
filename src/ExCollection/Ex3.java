package ExCollection;

import java.util.ArrayList;

public class Ex3 {

	public static void main(String[] args) {
		// Write a Java program to insert an element into the array list at the first
		// position
		ArrayList<String> color = new ArrayList<String>();
		color.add("red");
		color.add("blue");
		color.add("yellow");
		color.add("gray");
		color.add("black");
		color.add("green");
		color.add(0, "orange");
		System.out.println(color);
	}

}
