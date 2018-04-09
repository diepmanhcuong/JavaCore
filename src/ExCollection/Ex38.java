package ExCollection;

import java.util.LinkedList;
import java.util.Map;

public class Ex38 {

	public static void main(String[] args) {
		//  Write a Java program to clone an linked list to another linked lis
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("a");
		ll.add("b");
		ll.add("c");
		ll.add("d");
		ll.add("e");
		ll.add("f");
		ll.add("g");
		System.out.println(ll);
		LinkedList<String> ll2 = (LinkedList<String>) ll.clone();
		System.out.println(ll2);
		
	}

}
