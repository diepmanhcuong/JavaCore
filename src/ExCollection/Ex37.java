package ExCollection;

import java.util.LinkedList;

public class Ex37 {

	public static void main(String[] args) {
		//  Write a Java program to join two linked lists.
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
		ll2.add("bb");
		ll2.add("cc");
		ll2.add("dd");
		ll2.add("ee");
		ll2.add("ff");
		ll2.add("gg");
		System.out.println(ll2);
		LinkedList<String> ll3 = new LinkedList<String>();
		ll3.addAll(ll);
		ll3.addAll(ll2);
		System.out.println(ll3);
	}

}
