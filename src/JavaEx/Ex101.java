package JavaEx;

import java.util.Arrays;

public class Ex101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Check if the number of 10 is greater than number to 20's in a given array of
		// integers
		int[] arr = { 10, 2, 10, 20, 43, 65, 324, 23 };
		int count = 0, count1 = 0;
		System.out.println("Original Array:" + Arrays.toString(arr));
		for (int i = 0; i < arr.length - 1; i++) {
			if(arr[i]==10)
				count++;
			if(arr[i]==20)
				count1 ++;
		}
		System.out.println(String.valueOf(count>count1));
	}

}
