package ExCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex12 {

	public static void main(String[] args) {
		 //Write a Java program to extract a portion of a array list.
		ArrayList<String> color = new ArrayList<String>();
		color.add("red");
		color.add("blue");
		color.add("yellow");
		color.add("gray");
		color.add("black");
		color.add("green");
		System.out.println(color);
		List<String> cl = color.subList(0, 4);
		System.out.println("then sub: "+cl);
	}

}
