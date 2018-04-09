package JavaEx;

public class Ex73 {

	public static void main(String[] args) {
		// Write a Java program to create a new string taking first and last characters
		// from two given strings. If the length of either string is 0 use "#" for
		// missing character. Go to the editor
		// Test Data: str1 = "Python"
		// str2 = " "
		// Sample Output:

		// P#
		String str= "Cuong";
		String str2="Nhan";
		int a = str2.length();
		
		if("".equals(str2)){
			System.out.println(str.charAt(0)+"#");
		}else System.out.println(str.charAt(0)+""+str2.substring(str2.length()-1));

	}

}
