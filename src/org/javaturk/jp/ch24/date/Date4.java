
package org.javaturk.jp.ch24.date;

import org.javaturk.jp.ch24.date.dateEnums.*;

public class Date4 {
	
	private DayOfMonth dayOfMonth;
	private Month month;
	private Year year;

	public Date4(DayOfMonth dayOfMonth, Month month, Year year) {
		this.dayOfMonth = dayOfMonth;
		this.month = month;
		this.year = year;
	}

	public DayOfMonth getDayOfMonth() {
		return dayOfMonth;
	}

	public void setDayOfMonth(DayOfMonth dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
	}

	public Month getMonth() {
		return month;
	}

	public void setMonth(Month month) {
		this.month = month;
	}

	public Year getYear() {
		return year;
	}

	public void setYear(Year year) {
		this.year = year;
	}
}
