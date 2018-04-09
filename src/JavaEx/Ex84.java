package JavaEx;

public class Ex84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java program to take the last three characters from a given string
		// and add the three characters at both the front and back of the string. String
		// length must be greater than three and more. 
		// Test data: "Python" will be "honPythonhon"
		// Sample Output:

		// PyPythonPy
		
		String str = "python";
		System.out.println("test data: "+str);
		String sub  = str.substring(str.length()-3,str.length());
		System.out.println(sub+str+sub);
	}

}
