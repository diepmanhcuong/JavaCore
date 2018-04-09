package ExCollection;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex26 {

	public static void main(String[] args) {
		// Write a Java program to iterate a linked list in reverse order
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("a");
		ll.add("b");
		ll.add("c");
		ll.add("d");
		ll.add("e");
		ll.add("f");
		ll.add("g");
		System.out.println(ll);
		
		Iterator p = ll.descendingIterator();
		while(p.hasNext()) {
			System.out.println(p.next());
		}
		
	}

}
