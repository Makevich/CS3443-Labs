package length;
/*
 * @author Dusan Makevic
 * 
 * A Yard object has properties of Length object. It holds the length value in Yards.
 */
public class Yard extends Length {

	public static final double METERS_PER_YARD = 0.9144;
	public static final double FEET_PER_YARD = 3.0;
	public static final double INCHES_PER_YARD = 36.0;
	
	/*
	 * Creates a Yard object
	 * @param length a double representing a length
	 */
	public Yard(double length){
		super(length);
	}
	
	public double toYards(){
		return this.getLength();
	}
	public double toMeters() {
		return this.getLength() * METERS_PER_YARD; 
	}
	
	public double toFeet() {
		return this.getLength() * FEET_PER_YARD;
	}
	
	public double toInches(){
		return this.getLength() * INCHES_PER_YARD;
	}
	
	public String getUnit() {
		if (this.getLength()==1)
			return "yard";
		else
			return "yards";
	}

	public void add(Length other) {
		this.setLength(this.getLength() + other.toYards());
	}
}
