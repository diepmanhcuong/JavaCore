package ExCollection;

import java.util.ArrayList;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> color = new ArrayList<String>();
		color.add("red");
		color.add("blue");
		color.add("yellow");
		color.add("gray");
		color.add("black");
		color.add("green");
		color.ensureCapacity(10);
		color.add("b");
		color.add("b");
		color.add("b");
		color.add("b");
		color.add("b");
		System.out.println(color);

	}

}
