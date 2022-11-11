package ru.fp.selenium.util;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTimeHelper {
	public static String getBeginDate(int days) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		c.add(Calendar.DATE, days);
		String output = sdf.format(c.getTime());
		return output;
	}

}
