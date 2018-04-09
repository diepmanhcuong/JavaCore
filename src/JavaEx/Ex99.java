package JavaEx;

public class Ex99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,2,5,2,6,2,7};
		int result =0;
		int x = 2;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=x &&arr[i+1]!=x) {
				result= 1;
			}
		}
		if(result ==0) {
			System.out.println(String.valueOf(true));
		}else System.out.println(String.valueOf(false));
	}

}
