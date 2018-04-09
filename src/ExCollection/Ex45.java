package ExCollection;

import java.util.LinkedList;

public class Ex45 {

	public static void main(String[] args) {
		// Write a Java program to test an linked list is empty or not
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("a");
		ll.add("b");
		ll.add("c");
		ll.add("d");
		ll.add("e");
		ll.add("f");
		ll.add("g");
		System.out.println(ll);
		System.out.println(ll.isEmpty());
	}

}
