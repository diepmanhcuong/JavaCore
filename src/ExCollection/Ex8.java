package ExCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Ex8 {

	public static void main(String[] args) {
		// Write a Java program to sort a given array list
		ArrayList<String> color = new ArrayList<String>();
		color.add("red");
		color.add("blue");
		color.add("yellow");
		color.add("gray");
		color.add("black");
		color.add("green");
		System.out.println(color);
		Collections.sort(color);
		System.out.println("array the sorted:"+color);
	}

}
