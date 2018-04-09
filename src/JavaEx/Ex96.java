package JavaEx;

public class Ex96 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java program to check if there is a 10 in a given array of integers
		// with a 20 somewhere later in the array
		int[] arr = {10,20,45,54,34,65,34};
		boolean bl = false;
		for(int i=0;i<arr.length;i++) {
			for(int j =i+1;j<arr.length;j++)
			if(arr[i]==10&&arr[j]==20) {
				bl=true;
			}
		}System.out.println(bl);
		
	}

}
