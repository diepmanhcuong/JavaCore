package JavaEx;

import java.util.Arrays;

public class Ex102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java program to check if a specified array of integers contains 10's
		// or 30's.
		int[] arr = {10,20,30,21,32};
		int rs=0;
		System.out.println("Original Array: "+Arrays.toString(arr));
		for (int i = 0; i < arr.length ; i++) {
			if(arr[i]==10||arr[i]==30)
				rs=1;
		}
		if(rs==1)
			System.out.println(String.valueOf(true));
		if(rs==0) System.out.println(String.valueOf(false));
	}

}
