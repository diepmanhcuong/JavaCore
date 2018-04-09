package ExCollection;

import java.util.ArrayList;
import java.util.Collections;

public class Ex11 {

	public static void main(String[] args) {
		//Write a Java program to reverse elements in a array list.
		ArrayList<String> color = new ArrayList<String>();
		color.add("red");
		color.add("blue");
		color.add("yellow");
		color.add("gray");
		color.add("black");
		color.add("green");
		System.out.println(color);
		Collections.reverse(color);
		System.out.println("then reverse: "+color);
	}

}
