package length;
/*
 * @author Dusan Makevic
 * 
 * A Meter object has properties of Length object. It holds the length value in Meters. 
 */
public class Meter extends Length{

	public static final double FEET_PER_METER = 3.28084;
	public static final double YARDS_PER_METER = 1.09361;
	public static final double INCHES_PER_METER = 39.3701;
	
	/*
	 * Creates a Meter object
	 * @param length a double representing a length
	 */
	public Meter(double length) {
		super(length);
	}
	
	public String getUnit(){
		if (this.getLength() == 1)
			return "meter";
		else
			return "meters";
	}

	public void add(Length other) {
		this.setLength(this.getLength() + other.toMeters());
	}

	public double toMeters() {
		return this.getLength();
	}
	public double toYards() {
		return this.getLength() * YARDS_PER_METER; 
	}
	
	public double toFeet() {
		return this.getLength() * FEET_PER_METER;
	}
	
	public double toInches(){
		return this.getLength() * INCHES_PER_METER;
	}
}
