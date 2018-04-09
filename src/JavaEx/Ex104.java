package JavaEx;

import java.util.Arrays;

public class Ex104 {

	public static void main(String[] args) {
		// Write a Java program to create a new array from a given array of integers,
		// new array will contain the elements from the given array before the last
		// element value 10
		int[] arr = {12,232,3432,32423,131312,10};
		System.out.print("Original Array: "+Arrays.toString(arr));
		if(arr[arr.length-1]==10) {
			System.out.println(String.valueOf("\n"+true));
		}else System.out.println(String.valueOf("\n"+false));

	}

}
