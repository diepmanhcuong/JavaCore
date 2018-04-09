package ExCollection;

import java.util.LinkedList;

public class Ex28 {

	public static void main(String[] args) {
		// Write a Java program to insert elements into the linked list at the first and
		// last position.
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("a");
		ll.add("b");
		ll.add("c");
		ll.add("d");
		ll.add("e");
		ll.add("f");
		ll.add("g");
		ll.addFirst("haha");
		ll.addLast("hihi");
		System.out.println(ll);

	}

}
