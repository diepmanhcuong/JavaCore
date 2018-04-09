package ExCollection;

import java.util.LinkedList;

public class Ex40 {

	public static void main(String[] args) {
		// Write a Java program to retrieve but does not remove, the first element of a
		// linked list
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("a");
		ll.add("b");
		ll.add("c");
		ll.add("d");
		ll.add("e");
		ll.add("f");
		ll.add("g");
		System.out.println(ll);
		System.out.println(ll.peekFirst());
		System.out.println(ll);

	}

}
