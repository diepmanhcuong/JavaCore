package JavaEx;

import java.util.Arrays;

public class Ex105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java program to check if a group of numbers (l) at the start and end
		// of a given array are same

		int[] arr = { 10, 232, 3432, 32423, 131312, 10 };
		System.out.print("Original Array: " + Arrays.toString(arr));
		if (arr[arr.length - 1] == arr[0]) {
			System.out.println(String.valueOf("\n" + true));
		} else
			System.out.println(String.valueOf("\n" + false));
	}

}
