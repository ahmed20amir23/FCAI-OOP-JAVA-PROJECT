package Package;

import java.util.Date;

public class Circle extends Shape {
	private double raduis;
	
	public Circle(double r) {
		this.raduis = r;
	}
	
	public Circle(String C, double r) {
		super(C);
		this.raduis = r;
	}
	
	public void setRaduis(double raduis) {
		this.raduis = raduis;
	}
	
	public double getRaduis() {
		return raduis;
	}
	
	public double getArea() {
		return Math.PI * this.raduis * this.raduis;
	}
	
	public double getPerimeter() {
		return 2 * Math.PI * this.raduis; 
	}
	
	public String howToDrawable() {
		return "Circle";
	}
	
	
	public String toString() {
		return "raduis: " + this.raduis;
	}
	
	public String howToPaint() {
		return "Circle Shape";
	}
	
	public Date getDataCreated() {
		return super.dateCreated;
	}
	
	
}
