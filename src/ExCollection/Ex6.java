package ExCollection;

import java.util.ArrayList;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java program to remove the third element from a array list.
		ArrayList<String> color = new ArrayList<String>();
		color.add("red");
		color.add("blue");
		color.add("yellow");
		color.add("gray");
		color.add("black");
		color.add("green");
		System.out.println(color);
		color.remove(3);
		System.out.println(color);
	}

}
