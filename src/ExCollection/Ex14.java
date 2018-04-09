package ExCollection;

import java.util.ArrayList;
import java.util.Collections;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Write a Java program of swap two elements in an array list.
		ArrayList<String> color = new ArrayList<String>();
		color.add("red");
		color.add("blue");
		color.add("yellow");
		color.add("gray");
		color.add("black");
		color.add("green");
		System.out.println(color);
		Collections.swap(color, 2, 5);
		System.out.println("then swap: "+color);
	}

}
