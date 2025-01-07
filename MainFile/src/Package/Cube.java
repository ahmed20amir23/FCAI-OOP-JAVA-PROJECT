package Package;

import java.util.Date;

public class Cube extends ThreeDShape{
	private double side;
	
	public Cube(double s) {
		this.side = s;
	}
	
	public Cube(String c, double s) {
		super(c);
		this.side = s;
	}
	
	public void setSide(double s) {
		this.side = s;
	}
	
	public double getSide() {
		return this.side;
	}
	
	public double getVolume() {
		return Math.pow(side, 3);
	}
	
	public double getArea() {
		return Math.pow(side, 2) * 6;
	}
	
	public double getPerimeter() {
		return 12 * this.side;
	}

	public String howToDrawable() {
		return "Cube";
	}
	
	
	public String toString() {
		return "Cube --> side = " + side;
	}
	
	public String howToPaint() {
		return "Cube Shape";
	}
	
	public Date getDataCreated() {
		return super.dateCreated;
	}
}
