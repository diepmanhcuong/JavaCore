package ExCollection;

import java.util.ArrayList;

public class Ex22 {

	public static void main(String[] args) {
		// Write a Java program to print all the elements of a ArrayList using the
		// position of the elements
		ArrayList<String> color = new ArrayList<String>();
		color.add("red");
		color.add("blue");
		color.add("yellow");
		color.add("gray");
		color.add("black");
		color.add("green");
		for(int i = 0;i<color.size();i++) {
			System.out.println(color.get(i));
		}

	}

}
