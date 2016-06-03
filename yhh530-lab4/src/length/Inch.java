package length;
/*
 * @author Dusan Makevic
 * 
 * An Inch object has properties of Length object. It holds the length value in Inches.
 */

public class Inch extends Length {
	
	public static final double METERS_PER_INCH = 0.0254;
	public static final double FEET_PER_INCH = 0.0833333;
	public static final double YARDS_PER_INCH = 0.0277778;
	
	/*
	 * Creates an Inch object
	 * @param length a double representing a length
	 */
	public Inch(double length) {
		super(length);
	}
	
	public String getUnit(){
		if (super.getLength() == 1)
			return "inch";
		else
			return "inches";
}

	public void add(Length other) {
		this.setLength(this.getLength() + other.toInches());
		
	}

	public double toInches(){
		return this.getLength();
	}
	public double toMeters() {
		return super.getLength() * METERS_PER_INCH; 
	}
	public double toFeet() {
		return super.getLength() * FEET_PER_INCH;
	}
	public double toYards(){
		return super.getLength() * YARDS_PER_INCH;
	}	
}