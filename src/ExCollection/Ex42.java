package ExCollection;

import java.util.LinkedList;

public class Ex42 {

	public static void main(String[] args) {
		// Write a Java program to check if a particular element exists in a linked list
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("a");
		ll.add("b");
		ll.add("c");
		ll.add("d");
		ll.add("e");
		ll.add("f");
		ll.add("g");
		System.out.println(ll);
		if(ll.contains("a")) {
			System.out.println("found the element");
		}else System.out.println("there is no such element");

	}

}
