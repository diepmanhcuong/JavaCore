package JavaEx;

public class Ex92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java program to check whether a security manager has already been
		// established for the current application or not.
		int[] arr = { 20, 21, 43, 54645, 12312, 4645, 21312312 };
		int odd = 0, even = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even++;
			} else
				odd++;
		}
		System.out.println("odd number: " + odd);
		System.out.println("even number: " + even);
	}

}
