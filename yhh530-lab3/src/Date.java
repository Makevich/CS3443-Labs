import java.util.Scanner;

/**
 * @author Dusan Makevic
 */
public class Date implements Comparable<Date> {

	private int month;
	private int year;
	private int day;
	
	/**
	 * Creates Date object using the input line from the text file. 
	 * @param line String that represents the line in the text file.
	 */
	public Date(String line){
	 Scanner lineScan = new Scanner(line.replaceAll(",", ""));
		switch (lineScan.next().substring(0,3)){
			case "Jan": month = 1; break;
			case "Feb": month = 2; break;
			case "Mar": month = 3; break;
			case "Apr": month = 4; break;
			case "May": month = 5; break;
			case "Jun": month = 6; break;
			case "Jul": month = 7; break;
			case "Aug": month = 8; break;
			case "Sep": month = 9; break;
			case "Oct": month = 10; break;
			case "Nov": month = 11; break;
			case "Dec": month = 12; break;
			default: month = 0; break;
		}
		int tempDay = lineScan.nextInt();
		int tempYear = lineScan.nextInt();
		checkYear(tempYear);
		checkDay(tempDay);
		lineScan.close();
	}
	/**
	 * Compares two date objects.
	 * @param other a Date object used for comparison
	 * @return -1 if this date is greater than the date passed as a parameter; 
	 * 			1 if this date is smaller than the date passed as a parameter; 
	 * 			0 if dates are equal.
	 */
	public int compareTo (Date other) {
		
		if (year > other.getYear())
			return 1;
		else if (year < other.getYear())
			return -1;
		else{
			if (month > other.getMonth())
				return 1;
			else if (month < other.getMonth())
				return -1;
			else{
				if (day > other.getDay())
					return 1;
				else if (day < other.getDay())
					return -1;
				else
					return 0;
			}
		}
		}
	/**
	 * Ensures that the year from the input file is valid.
	 * @param y an integer parsed from the input file.
	 */
	private void checkYear(int y) {
			  if (y >= 1) {
			     year = y;
			  } else { 
			     year = 0;
			  }
	}
	
	/**
	 * Ensures that the day from the input file is valid.
	 * @param d an integer parsed from the input file.
	 */
	private void checkDay (int d) {
		
		boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
		day = d;
		if (d <1){
				day = 0;
		}if (d > 31 && (month == 1|| month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)) {
			    day = 0;
		}if (d > 30 && (month == 4|| month == 6 || month == 9 || month == 11)) {
			    day = 0;
		}if (d > 28 && (month == 2 && isLeapYear == false)) {
			 	day = 0;
		}if (d > 29 && (month == 2 && isLeapYear == true)) {
			 	day = 0; 
			}
		}
	/**
	 * Converts the month from a number to a word.
	 * @param m an integer that represents the month.
	 */
	private String monthFullName(int m){
		String monthFullName = "";
		switch (m){
		case 1: monthFullName = "January"; break;
		case 2: monthFullName = "February"; break;
		case 3: monthFullName = "March"; break;
		case 4: monthFullName = "April"; break;
		case 5: monthFullName = "May"; break;
		case 6: monthFullName = "June"; break;
		case 7: monthFullName = "July"; break;
		case 8: monthFullName = "August"; break;
		case 9: monthFullName = "September"; break;
		case 10: monthFullName = "October"; break;
		case 11: monthFullName = "November"; break;
		case 12: monthFullName = "December"; break;
		}
		return monthFullName;
	}
	/**
	 * Returns the day
	 * @return an integer representing a day.
	 */
	public int getDay(){
		return day;
	}
	/**
	 * Returns the month
	 * @return an integer representing a month.
	 */
	public int getMonth(){
		return month;
	}
	/**
	 * Returns the year
	 * @return an integer representing a year.
	 */
	public int getYear(){
		return year;
	}
	/**
	 * Shows the information
	 * @return String that prints out the date in the following format: Date:  MMMM dd, yyyy.
	 * 		   If the date is not valid returns a string "Invalid date"
	 */
	public String toString(){
		if(day == 0 || month == 0 || year == 0){
			return "Invalid Date";}
		else
			return "Date: " + monthFullName(month) + " " + day + ", " + year;
	}
}
