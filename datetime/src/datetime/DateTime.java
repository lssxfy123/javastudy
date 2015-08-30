package datetime;

import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;

public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		System.out.println(now);
		
		DateFormat date_time = DateFormat.getDateTimeInstance();
		System.out.println(date_time.format(now).toString());
		
		DateFormat date = DateFormat.getDateInstance();
		System.out.println(date.format(now).toString());
		
		DateFormat time = DateFormat.getTimeInstance();
		System.out.println(time.format(now).toString());
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = cal.get(Calendar.MONTH);
		System.out.println(month);
		
		int day = cal.get(Calendar.DATE);
		System.out.println(day);
		
		int hour = cal.get(Calendar.HOUR);
		System.out.println(hour);
		
		int minute = cal.get(Calendar.MINUTE);
		System.out.println(minute);
		
		int second = cal.get(Calendar.SECOND);
		System.out.println(second);
		
		cal.set(2013, 2, 3, 8, 50, 12);
		
		year = cal.get(Calendar.YEAR);
		System.out.println(year);
		
		month = cal.get(Calendar.MONTH);
		System.out.println(month);
		
		day = cal.get(Calendar.DATE);
		System.out.println(day);
		
		hour = cal.get(Calendar.HOUR);
		System.out.println(hour);
		
		minute = cal.get(Calendar.MINUTE);
		System.out.println(minute);
		
		second = cal.get(Calendar.SECOND);
		System.out.println(second);
	}

}
