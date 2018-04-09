package ExCollection;

import java.util.ArrayList;

public class Ex16 {

	public static void main(String[] args) {
		//Write a Java program to clone an array list to another array list.
		ArrayList<String> color = new ArrayList<String>();
		color.add("red");
		color.add("blue");
		color.add("yellow");
		color.add("gray");
		color.add("black");
		color.add("green");
		ArrayList<String> color2 = (ArrayList<String>) color.clone();
		System.out.println(color2);
	}

}
