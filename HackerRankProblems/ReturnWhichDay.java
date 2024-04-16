package HackerRankProblems;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;

public class ReturnWhichDay {

//	public static String FindDay(int year, int month, int day)
//	{
		public static String findDay(int month, int day, int year) {
		LocalDate s = LocalDate.of(year, month, day);
		DayOfWeek x = s.getDayOfWeek();
		return x.toString();
		
	}
		 public static String findDay1(int month, int day, int year) {
		        Calendar defaultCalendar = Calendar.getInstance();
		        defaultCalendar.set(year, month-1, day);
		        
		        String[] strDaysOfWeeks = new String[] {
						"SUNDAY",
						"MONDAY",
						"TUESDAY",
						"WEDNESDAY",
						"THURSDAY",
						"FRIDAY", "SATURDAY"};

		        return strDaysOfWeeks[defaultCalendar.get(Calendar.DAY_OF_WEEK)-1];
		    }
		 
	public static void main(String[] args) {
		String t = findDay1(03,04,2012);
		System.out.println(t);
	}

}
