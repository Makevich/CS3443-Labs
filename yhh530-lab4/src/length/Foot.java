package length;
/*
 * @author Dusan Makevic
 * 
 * A Foot object has properties of Length object. It holds the length value in Feet.
 */
public class Foot extends Length{

	public static final double METERS_PER_FOOT = 0.3048;
	public static final double YARDS_PER_FOOT = 0.333333;
	public static final double INCHES_PER_FOOT = 12.0;
	
	/*
	 * Creates a Foot object
	 * @param length a double representing a length
	 */
	public Foot(double length) {
		super(length);
	}

	public String getUnit(){
		if (this.getLength() == 1)
			return "foot";
		else
			return "feet";
}

	@Override
	public void add(Length other) {
		this.setLength(this.getLength() + other.toFeet());
	}

	public double toFeet(){
		return this.getLength();
	}
	
	public double toMeters() {
		return this.getLength() * METERS_PER_FOOT; 
	}
	
	public double toYards() {
		return this.getLength() * YARDS_PER_FOOT;
	}
	
	public double toInches(){
		return this.getLength() * INCHES_PER_FOOT;
	}
	
}