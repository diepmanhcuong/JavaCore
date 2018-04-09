package JavaEx;

public class Ex76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java program to test if the first and the last element of two array
		// of integers are same. The length of the array must be greater than or equal
		// to 2. Go to the editor
		// Test Data: array1 = 50, -20, 0, 30, 40, 60, 12
		// array2 = 45, 20, 10, 20, 30, 50, 11
		// Sample Output:

		// false
		
		int[] arr1 = {50,15,20,10,100};
		int[] arr2 = {10,15,20,400,394};
		boolean bl = true;
		if(arr1[arr1.length-1]==arr2[0]) {
			System.out.println(bl);
		}else System.out.println(!bl);
	}

}
