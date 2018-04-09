package ExCollection;

import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {
		// Write a Java program to create a new array list, add some colors (string) and
		// print out the collection
		ArrayList<String> color = new ArrayList<String>();
		color.add("red");
		color.add("blue");
		color.add("yellow");
		color.add("gray");
		color.add("black");
		color.add("green");
		color.add("pink");
		System.out.println(color);
		for (String string : color) {
			System.out.println(string);
		}
	}

}
