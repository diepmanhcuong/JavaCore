package ExCollection;

import java.util.LinkedList;

public class Ex39 {

	public static void main(String[] args) {
		// Write a Java program to remove and return the first element of a linked list.
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("a");
		ll.add("b");
		ll.add("c");
		ll.add("d");
		ll.add("e");
		ll.add("f");
		ll.add("g");
		System.out.println("the linkedlist current: "+ll);
		System.out.println("remove element: "+ll.pop());
		System.out.println(" the first element then removed: "+ll);
		

	}

}
