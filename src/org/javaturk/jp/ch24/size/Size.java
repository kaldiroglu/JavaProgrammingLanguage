package org.javaturk.jp.ch24.size;

enum Size {
	SMALL("S", 1), MEDIUM("M", 2), LARGE("L", 3), EXTRA_LARGE("XL", 4);

	private String abbreviation;
	private int no;

	private static String description;
	private static int count;

	static {
		System.out.println("in static initializer block");
		description = "These are sizes.";
	}

	{
		//count++; // can't do this!
		System.out.println("in object initializer block");
	}

	private Size(String abbreviation, int no) {
		System.out.println("in Size(String abbreviation, int no)");
		this.abbreviation = abbreviation;
		this.no = no;
//		count++: // can't do this!
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public int getNo() {
		return no;
	}

	public static Size getSizeForAbbreviation(String abbreviation){
		Size size = switch(abbreviation){
			case "S" -> SMALL;
			case "M" -> MEDIUM;
			case "X" -> LARGE;
			case "XL" -> EXTRA_LARGE;
			default -> MEDIUM;
		};

		return size;
	}

	public static String getDescription() {
		return description;
	}
}