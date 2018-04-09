package JavaEx;

import java.util.Arrays;

public class Ex107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java program to check if an array of integers contains three
		// increasing adjacent numbers.
		int[] array_nums = { 11, 15, 10, 9, 45, 20 };
		System.out.println("Original Array: " + Arrays.toString(array_nums));
		int rs = 1;
		for (int i = 0; i <= array_nums.length - 3; i++) {
			if (array_nums[i] + 1 == array_nums[i + 1] && array_nums[i + 1] + 1 == array_nums[i + 2])
				rs = 0;
		}
		if (rs == 1) {
			System.out.println(String.valueOf(false));
		} else
			System.out.println(String.valueOf(true));
	}

}
