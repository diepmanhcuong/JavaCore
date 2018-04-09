package ExCollection;

import java.util.Collections;
import java.util.LinkedList;

public class Ex44 {

	public static void main(String[] args) {
		// Write a Java program to compare two linked lists
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("a");
		ll.add("b");
		ll.add("c");
		ll.add("d");
		ll.add("e");
		ll.add("f");
		ll.add("g");
		System.out.println(ll);
		LinkedList<String> ll2 = new LinkedList<String>();
		ll2.add("aa");
		ll2.add("ba");
		ll2.add("cc");
		ll2.add("dd");
		ll2.add("ee");
		ll2.add("ff");
		ll2.add("gf");
		System.out.println(ll2);
		LinkedList<String> ll3 = new LinkedList<String>();
		for (String str : ll) {
			ll3.add(ll2.contains(str) ? "yes" : "no");

		}
		System.out.println(ll3);
	}

}
