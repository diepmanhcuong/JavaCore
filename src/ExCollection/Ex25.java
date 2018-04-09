package ExCollection;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex25 {

	public static void main(String[] args) {
		// Write a Java program to iterate through all elements in a linked list
		// starting at the specified position
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("a");
		ll.add("b");
		ll.add("c");
		ll.add("d");
		ll.add("e");
		ll.add("f");
		ll.add("g");
		Iterator p = ll.iterator();
		while(p.hasNext()) {
			System.out.println(p.next());
		}

	}

}
