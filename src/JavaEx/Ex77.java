package JavaEx;

public class Ex77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java program to create a new array of length 2 from two arrays of
		// integers with three elements and the new array will contain the first and
		// last elements from the two arrays. Go to the editor
		// Test Data: array1 = 50, -20, 0
		// array2 = 5, -50, 10
		// Sample Output:

		// Array1: [50, -20, 0]
		// Array2: [5, -50, 10]
		// New Array: [50, 10]
		
		int[] a = {50,20,0};
		int[] b = {5,-50,10};
		int[] newArr = {a[0],b[b.length-1]};
		System.out.print("Array 1: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+",");
		}
		System.out.print("\nArray 2: ");
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+",");
		}
		System.out.print("\nnew Array : ");
		for(int i=0;i<newArr.length;i++) {
			System.out.print(newArr[i]+",");
		}
	}

}
