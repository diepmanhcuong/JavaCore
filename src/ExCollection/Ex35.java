package ExCollection;

import java.util.Collections;
import java.util.LinkedList;

public class Ex35 {

	public static void main(String[] args) {
		// Write a Java program of swap two elements in an linked list
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("a");
		ll.add("b");
		ll.add("c");
		ll.add("d");
		ll.add("e");
		ll.add("f");
		ll.add("g");
		System.out.println(ll);
		Collections.swap(ll, 3, 1);
		System.out.println("then swaped: "+ll);

	}

}
