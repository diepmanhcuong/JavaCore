package ExCollection;

import java.util.ArrayList;

public class Ex2 {

	public static void main(String[] args) {

		// Write a Java program to iterate through all elements in a array list.
		ArrayList<String> color = new ArrayList<String>();
		color.add("red");
		color.add("blue");
		color.add("yellow");
		color.add("gray");
		color.add("black");
		color.add("green");
		color.add("pink");
		for (String string : color) {
			System.out.println(string);
		}
	}

}
