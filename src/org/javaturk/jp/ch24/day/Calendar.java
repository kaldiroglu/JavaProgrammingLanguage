package org.javaturk.jp.ch24.day;

public class Calendar {
	private Day today;

	public Calendar(Day today) {
		this.today = today;
	}

	public Day getToday() {
		return today;
	}

	public boolean isWeekend() {
		return switch (today) {
			case SATURDAY, SUNDAY -> true;
			default -> false;
		};
	}

	public Day nextDay() {
		Day[] days = Day.values();
		return days[(today.ordinal() + 1) % days.length];   // SATURDAY -> SUNDAY
	}

	public void advance() {
		today = nextDay();
	}

	public int daysUntil(Day target) {
		int week = Day.values().length;
		return (target.ordinal() - today.ordinal() + week) % week;
	}

	public void printWeek() {
		for (Day day : Day.values()) {
			String marker = (day == today) ? "  <-- today" : "";
			System.out.println(day.ordinal() + " " + day.name() + marker);
		}
	}

	public static void main(String[] args) {
		Calendar calendar = new Calendar(Day.FRIDAY);
		calendar.printWeek();

		System.out.println("\nWeekend? " + calendar.isWeekend());
		System.out.println("Days until MONDAY: " + calendar.daysUntil(Day.MONDAY));

		calendar.advance();
		System.out.println("\nAfter advance(): " + calendar.getToday() + ", weekend? " + calendar.isWeekend());
		calendar.advance();
		System.out.println("After advance(): " + calendar.getToday() + "  (wrapped around the week)");

		// new Calendar(8);        // does not compile: an int is not a Day
		// new Calendar("MONDAY"); // does not compile: a String is not a Day
	}
}
