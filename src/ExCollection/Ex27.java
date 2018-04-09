package ExCollection;

import java.util.LinkedList;

public class Ex27 {

	public static void main(String[] args) {
		// Write a Java program to insert the specified element at the specified
		// position in the linked list
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("a");
		ll.add("b");
		ll.add("c");
		ll.add("d");
		ll.add("e");
		ll.add("f");
		ll.add("g");
		ll.add(3, "p");
		System.out.println(ll);
	}

}
