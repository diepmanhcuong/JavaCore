package ExCollection;

import java.util.LinkedList;

public class Ex30 {

	public static void main(String[] args) {
		// Write a Java program to get the first and last occurrence of the specified
		// elements in a linked list
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("a");
		ll.add("b");
		ll.add("c");
		ll.add("d");
		ll.add("e");
		ll.add("f");
		ll.add("g");
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());

	}

}
