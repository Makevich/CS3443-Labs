import java.io.*;
import java.util.*;
import length.*;
/*
 * @author Dusan Makevic
 * 
 * The Main method inputs information from the data.txt file and uses the length package to
 * process length values. Shows minimum and maximum value, sum of values in Meters, Yards,
 * Inches and Feet. 
 */
public class Lab4 {

	public static void main(String[] args) {

		ArrayList<Length> lengthArrayList = new ArrayList<Length>();
		
		Scanner in = null;
		try {
		    in = new Scanner(new File("data.txt"));
		} catch (FileNotFoundException exception) {
		    throw new RuntimeException("failed to open data.txt");
		}
		while (in.hasNextDouble()) {
		    double value = in.nextDouble();
		    String unit = in.next();
		    Length length = null;
		    // code here to use the value of unit to create the
		    // right type of Length object and store it in length.
		    if (unit.equalsIgnoreCase("yard")||unit.equalsIgnoreCase("yards"))
		    	length = new Yard(value);
		    if (unit.equalsIgnoreCase("meter")||unit.equalsIgnoreCase("meters"))
		    	length = new Meter(value);
		    if (unit.equalsIgnoreCase("foot")||unit.equalsIgnoreCase("feet"))
		    	length = new Foot(value);
		    if (unit.equalsIgnoreCase("inch")||unit.equalsIgnoreCase("inches"))
		    	length = new Inch(value);
		    
		    System.out.println(length);
		    lengthArrayList.add(length);
		}
		in.close();
		Length minimum = lengthArrayList.get(0);
		Length maximum = lengthArrayList.get(0);
		
		Yard sumYards = new Yard(0);
		Meter sumMeters = new Meter(0);
		Foot sumFeet = new Foot(0);
		Inch sumInches = new Inch(0);
		
		for (Length m : lengthArrayList){
			if (m.toMeters() < minimum.toMeters())
				minimum = m;
			if (m.toMeters() > maximum.toMeters())
				maximum = m;
			
			sumYards.add(m);
			sumMeters.add(m);
			sumFeet.add(m);
			sumInches.add(m);
		}
		System.out.println();
		System.out.println("Minimum is " + minimum.toString());
		System.out.println("Maximum is " + maximum.toString());
		System.out.println();
		
		System.out.println("Sum of Lengths Adding from First to Last");
		System.out.println(sumMeters);
		System.out.println(sumInches);
		System.out.println(sumFeet);
		System.out.println(sumYards);
		System.out.println();
		
		Yard sumYardsFromBehind = new Yard(0);
		Meter sumMetersFromBehind = new Meter(0);
		Foot sumFeetFromBehind = new Foot(0);
		Inch sumInchesFromBehind = new Inch(0);
		
		for (int i=lengthArrayList.size()-1; i>=0; i--){
			sumYardsFromBehind.add(lengthArrayList.get(i));
			sumMetersFromBehind.add(lengthArrayList.get(i));
			sumFeetFromBehind.add(lengthArrayList.get(i));
			sumInchesFromBehind.add(lengthArrayList.get(i));
		}
		System.out.println("Sum of Lengths Adding from Last to First");
		System.out.println(sumMetersFromBehind);
		System.out.println(sumInchesFromBehind);
		System.out.println(sumFeetFromBehind);
		System.out.println(sumYardsFromBehind);
	}
	}
