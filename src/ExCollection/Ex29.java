package ExCollection;

import java.util.LinkedList;

public class Ex29 {

	public static void main(String[] args) {
		// Write a Java program to insert the specified element at the front of a linked
		// list
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("a");
		ll.add("b");
		ll.add("c");
		ll.add("d");
		ll.add("e");
		ll.add("f");
		ll.add("g");
		System.out.println(ll);
		ll.offerFirst("huhu");
		System.out.println(ll);
		ll.offerLast("hehe");
		System.out.println(ll);
	}

}
