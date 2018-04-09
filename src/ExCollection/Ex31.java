package ExCollection;

import java.util.LinkedList;

public class Ex31 {

	public static void main(String[] args) {
		// . Write a Java program to display the elements and their positions in a
		// linked list
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("a");
		ll.add("b");
		ll.add("c");
		ll.add("d");
		ll.add("e");
		ll.add("f");
		ll.add("g");
		for(int i = 0;i<ll.size();i++) {
			System.out.println("position element: "+ i +" element: "+ll.get(i));
		}

	}

}
