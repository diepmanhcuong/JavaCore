package ExCollection;

import java.util.LinkedList;

public class Ex24 {

	public static void main(String[] args) {
		// Write a Java program to iterate through all elements in a linked list
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("a");
		ll.add("b");
		ll.add("c");
		ll.add("d");
		ll.add("e");
		ll.add("f");
		ll.add("g");
		for (String string : ll) {
			System.out.println(string);
		}

	}

}
