package org.javaturk.jp.ch24.date;

import org.javaturk.jp.ch24.constants.DateConstants;
import org.javaturk.jp.ch24.date.dateEnums.DayOfMonth;
import org.javaturk.jp.ch24.date.dateEnums.Month;
import org.javaturk.jp.ch24.date.dateEnums.Year;

public class DateTest {

	public static void main(String[] args) {
		Date1 ed1 = new Date1(2, 25, 121213232);
		
		Date2 ed2 = new Date2("-8", "Ojak", "20019");
		
		Date1 ed3 = new Date1(DateConstants.DAY_8, DateConstants.JANUARY, DateConstants.YEAR_2019);

		Date4 ed4 = new Date4(DayOfMonth.DAY_10, Month.JUNE, Year.YEAR_2023);
	
		Date4 ed5 = new Date4(DayOfMonth.DAY_8, Month.JANUARY, Year.YEAR_2025);
		
		Date4 ed6 = new Date4(DayOfMonth.DAY_2, Month.JANUARY, Year.YEAR_2028);

		new Date4(DayOfMonth.DAY_10, Month.MARCH, Year.YEAR_2027);
	}
}
