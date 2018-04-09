package JavaEx;

public class Ex78 {

	public static void main(String[] args) {
		int[] a = {5,9};
		boolean bl =true;
		for(int i=0;i<a.length;i++) {
			if(a[i]<4||a[i]>7) {
				bl=false;
			}
		}
		System.out.println(bl);
	}

}
