package ExCollection;

import java.util.Collections;
import java.util.LinkedList;

public class Ex36 {

	public static void main(String[] args) {
		// Write a Java program to shuffle the elements in a linked list.
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("a");
		ll.add("b");
		ll.add("c");
		ll.add("d");
		ll.add("e");
		ll.add("f");
		ll.add("g");
		System.out.println(ll);
		Collections.shuffle(ll);
		System.out.println("then shuffle: "+ll);

	}

}
