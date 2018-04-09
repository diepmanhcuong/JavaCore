package JavaEx;

public class Ex98 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java program to check if the value 20 appears three times and no 20's
		// are next to each other in an given array of integers.

		int[] arr = { 20, 20, 20, 10, 20, 4, 5 };
		int count = 0;
		boolean bl = false;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == 20) {
				count++;

			}
		}
		for (int i = 1; i < arr.length; i++) {
			if (count >= 3) {
				if (arr[i - 1] == 20 && arr[i] == 20) {
					bl = false;
				}else bl =true;
		}}

		System.out.println(bl);

	}

}
