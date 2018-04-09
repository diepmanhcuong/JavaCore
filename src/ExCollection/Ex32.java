package ExCollection;

import java.util.LinkedList;

public class Ex32 {

	public static void main(String[] args) {
		// Write a Java program to remove a specified element from a linked list
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("a");
		ll.add("b");
		ll.add("c");
		ll.add("d");
		ll.add("e");
		ll.add("f");
		ll.add("g");
		System.out.println(ll);
		ll.remove(5);
		System.out.println("then remove: "+ll);

	}

}
