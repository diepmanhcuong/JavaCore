package ExCollection;

import java.util.ArrayList;

public class Ex7 {

	public static void main(String[] args) {
		 //Write a Java program to search an element in a array list
		ArrayList<String> color = new ArrayList<String>();
		color.add("red");
		color.add("blue");
		color.add("yellow");
		color.add("gray");
		color.add("black");
		color.add("green");
		if(color.contains("red")) {
			System.out.println("found the element");
		}else {
			System.out.println("there is no such element");
		}
	}

}
