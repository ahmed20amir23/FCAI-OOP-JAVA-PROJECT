package Package;
import java.util.Date;

public abstract class ThreeDShape extends Shape {
	
	public abstract double getVolume();
	
	public ThreeDShape() {
		
	}
	
	public ThreeDShape(Date d) {
		super(d);
	}
	// For Access a color in Cube Y Man
	public ThreeDShape(String color) {
		super(color);
	}
	
	public abstract String howToPaint();
}
