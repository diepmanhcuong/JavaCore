package JavaEx;

public interface Ex83 {
	public static void main(String[] args) {
		// Write a Java program to multiply corresponding elements of two arrays of
		// integers.
		// Sample Output:

		// Array1: [1, 3, -5, 4]

		/// Array2: [1, 4, -5, -2]

		// Result: 1 12 25 -8
		int[] arr1 = { 1, 3, -5, 4 };
		int[] arr2 = { 1, 4, -5, 2 };
		System.out.print("result: ");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (i == j) {
					int result = arr1[i] * arr2[j];
					System.out.print(result + ",");
				}
			}
		}
	}
}
