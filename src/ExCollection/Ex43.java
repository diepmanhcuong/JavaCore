package ExCollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex43 {

	public static void main(String[] args) {
		// Write a Java program to convert a linked list to array list.
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("a");
		ll.add("b");
		ll.add("c");
		ll.add("d");
		ll.add("e");
		ll.add("f");
		ll.add("g");
		List<String> ll2 = new ArrayList<String>(ll);
		System.out.println(ll2);
		

	}

}
