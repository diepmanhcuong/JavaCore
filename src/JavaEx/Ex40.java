package JavaEx;

public class Ex40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char Charset;
		System.out.println("List of available character sets: ");  
	    for (String str : java.nio.charset.Charset.availableCharsets().keySet()) {
	      System.out.println(str);
	    }
	}

}
