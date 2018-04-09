package JavaEx;

public class Ex80 {
	public static void main(String[] args) {
		// . Write a Java program to get the larger value between first and last element
		// of an array (length 3) of integers . Go to the editor
		// Sample Output:

		// Original Array: [20, 30, 40]
		// Larger value between first and last element: 40
		int[] arr = {20,50,40};
		int max=arr[0];
		System.out.println("Original Array: ");
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ,");
			if(max<arr[i]) {
				max=arr[i];
		}
	}
			System.out.println("Larger value between first and last element:"+max);
		
	}
}
