import java.util.Scanner;
import java.io.*;
/**
 * @author Dusan Makevic
 */
public class Lab3 {
	/**
	 * The main method uses the file dates.txt as an input file,
	 * processes dates and shows output with the arranged dates.
	 * Also, it shows a Date Range if the next
	 * date on the list is later than the previous one.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Date previousDate = null;
		Scanner in = null;
		try {
		    in = new Scanner(new File("dates.txt"));
		} catch (FileNotFoundException exception) {
		    System.err.println("failed to open dates.txt");
		    System.exit(1);
		}
		while (in.hasNextLine()) {
		    String line = in.nextLine();
		    Date date = new Date(line); 
		    System.out.println(date);
		    
		    if (previousDate != null){
		    	DateRange dateRange = new DateRange(date, previousDate);
		    	if (date.compareTo(previousDate) == 1)
		    		System.out.println(dateRange);
		    }
			previousDate = date;
		}
	}

}
