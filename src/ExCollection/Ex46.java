package ExCollection;

import java.util.LinkedList;

public class Ex46 {

	public static void main(String[] args) {
		// Write a Java program to replace an element in a linked list
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("a");
		ll.add("b");
		ll.add("c");
		ll.add("d");
		ll.add("e");
		ll.add("f");
		ll.add("g");
		System.out.println(ll);
		ll.set(2, "haha");
		System.out.println("then set: "+ll);

	}

}
