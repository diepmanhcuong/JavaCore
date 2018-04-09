package JavaEx;

public class Ex81 {

	public static void main(String[] args) {
		// . Write a Java program to swap the first and last elements of an array
		// (length must be at least 1) and create a new array. 
		// Sample Output:

		// Original Array: [20, 30, 40]
		// New array after swaping the first and last elements: [40, 30, 20]
		
		int[] arr = {20,30,40};
		System.out.println("Original Array: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		int max=arr[0];
		arr[0] = arr[arr.length-1];
		arr[arr.length-1] = max;
		System.out.println("New array after swaping the first and last elements: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
