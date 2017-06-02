package how2j;

import java.text.SimpleDateFormat;
import java.util.Date;

public class datenow {
	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-DD hh:mm:ss");
		Date date = new Date();
		String time = format.format(date);
		System.out.println(time);
	}
}
