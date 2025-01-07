package Package;
import java.util.Date;
// Abstract --> dosen't has a description
public abstract class Shape implements Drawable { 
	public Date dateCreated;
	public String color;
	
	public Shape() {
		
	}
	public Shape(Date d) {
		this.dateCreated = d;
	}
	public Shape(String color) {
		this.color = color;
	}
	
	public abstract Date getDataCreated();
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
	
	public abstract String howToPaint();
	
}
