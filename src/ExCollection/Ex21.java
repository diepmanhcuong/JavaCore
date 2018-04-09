package ExCollection;

import java.util.ArrayList;
import java.util.Collections;

public class Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java program to replace the second element of a ArrayList with the
		// specified element
		ArrayList<String> color = new ArrayList<String>();
		color.add("red");
		color.add("blue");
		color.add("yellow");
		color.add("gray");
		color.add("black");
		color.add("green");
		System.out.println(color);
		color.set(2, "orange");
		System.out.println("then set"+color);
	}

}
