package JavaEx;

public class Ex82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java program to find the largest element between first, last, and
		// middle values from an array of integers (even length). Go to the editor
		// Sample Output:

		// Original Array: [20, 30, 40, 50, 67]
		// Largest element between first, last, and middle values: 67
		int[] arr = {20, 30, 40, 50, 67};
		int max = arr[0];
		System.out.println("Original Array: ");
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
		for(int i = 0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}System.out.println("\nLargest element between first, last, and middle values: "+max);
	}

}
