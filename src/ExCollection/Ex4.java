package ExCollection;

import java.util.ArrayList;

public class Ex4 {

	public static void main(String[] args) {
		// Write a Java program to retrieve an element (at a specified index) from a
		// given array list
		ArrayList<String> color = new ArrayList<String>();
		color.add("red");
		color.add("blue");
		color.add("yellow");
		color.add("gray");
		color.add("black");
		color.add("green");
		System.out.println(color.get(3));

	}

}
