/**
 * @author Dusan Makevic
 */

public class DateRange {

	private String dateRange;
	/**
	 * Creates a DateRange object between two dates, assuming that
	 * the date two comes later than date one.
	 * @param one - Sooner date object
	 * @param two - Later date object
	 */
	DateRange (Date one, Date two){
			dateRange = "Date Range: " + two.toString() + " - " + one.toString();
	}
	/**
	 * Shows the date range between two dates.
	 * @return dateRange String that holds an information about the range
	 */
	public String toString(){
		return dateRange;
	}
}
