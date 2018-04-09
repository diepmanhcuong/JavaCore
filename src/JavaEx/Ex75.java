package JavaEx;

public class Ex75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java program to test if the first and the last element of an array of integers are same. The length of the array must be greater than or equal to 2. Go to the editor
		//Test Data: array = 50, -20, 0, 30, 40, 60, 10
		//Sample Output:

		//false
		int[] arrInt = {10,20,10,22,30,10};
		boolean bl = true;
		if(arrInt[0]==arrInt[arrInt.length-1]) {
			System.out.println(bl);
		}else System.out.println(!bl);
	}

}
