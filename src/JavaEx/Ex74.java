package JavaEx;

public class Ex74 {

	public static void main(String[] args) {
		// Write a Java program to test if 10 appears as either the first or last
		// element of an array of integers. The length of the array must be greater than
		// or equal to 2. Go to the editor
		// Sample Output:
		// Test Data: array = 10, -20, 0, 30, 40, 60, 10

		// true
		int[] arrInt = { 1, -29, 0, 3, 1, 99,10 };
		boolean bl = true;
		if (arrInt[0] == 10 || arrInt[arrInt.length - 1] == 10) {
			System.out.println(bl);
		} else
			System.out.println(false);
	}

}
