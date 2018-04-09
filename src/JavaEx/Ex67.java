package JavaEx;

public class Ex67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java program to insert a word in the middle of the another string. 
		// Insert "Tutorial" in the middle of "Python 3.0", so result will be Python
		// Tutorial 3.0
		// Sample Output:

		// Python Tutorial 3.0
		StringBuffer st = new StringBuffer("Python 3.0");
		st.insert(7, "Tutorial ");
		System.out.println(st);
	}

}
