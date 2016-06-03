import java.io.File;
import java.util.Scanner;

/**
 * @author Dusan Makevic
 */
public class Lab1 {
	/**
	 * The class uses the file data.txt as an input file,
	 * and searches through the file for tokens. It shows:
	 * <p>
	 * * how many tokens are numbers <p>
	 * * how many tokens are not numbers <p>
	 * * sum of all numbers in the text file
	 * @param args
	 */
	public static void main(String[] args) {
		
		int numbersCount = 0;
	    int nonNumbersCount = 0;
	    double sum = 0;
	    Scanner in;
	    Scanner tokenScan;
	    try {
	         in = new Scanner(new File("data.txt"));
	         while (in.hasNext()){
	            String token = in.next();
	            tokenScan = new Scanner(token);
	            if (tokenScan.hasNextDouble()) {
	               numbersCount++;
	               double d = Double.parseDouble(token);
	               sum += d;
	            } 
	            else {
	               nonNumbersCount++;;
	            }
	         }
	    in.close();
	    } 
	    catch (Exception FileNotFoundException) {
	    System.err.print("File not found.");
	    System.exit(1);
	    }
	    System.out.print(numbersCount +" "+nonNumbersCount + " ");
	    System.out.printf("%.1f",sum);
	}
}
