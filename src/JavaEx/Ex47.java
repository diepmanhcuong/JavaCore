package JavaEx;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex47 {

	public static void main(String[] args) {
		//  Write a Java program to display the current date time in specific format.
		//Sample Output:
		//Now: 2017/06/16 08:52:03.066
		SimpleDateFormat fm = new SimpleDateFormat(" yyyy/mm/dd hh:mm:ss.SSS");
		System.out.println("now: "+fm.format(System.currentTimeMillis()));
	}

}
