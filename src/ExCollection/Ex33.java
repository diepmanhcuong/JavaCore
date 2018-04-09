package ExCollection;

import java.util.LinkedList;

public class Ex33 {

	public static void main(String[] args) {
		//Write a Java program to remove first and last element from a linked list
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("a");
		ll.add("b");
		ll.add("c");
		ll.add("d");
		ll.add("e");
		ll.add("f");
		ll.add("g");
		System.out.println(ll);
		ll.removeFirst();
		ll.removeLast();
		System.out.println("then removed: "+ll);
	}

}
