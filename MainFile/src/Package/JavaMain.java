package Package;

public class JavaMain {

	public static void main(String[] args) {
		int arrSize = Integer.parseInt(args[0]);

		Drawable []arr = new Drawable[arrSize];
		double Sum = 0;
		for (int i = 0; i < arrSize; ++i) {
			String Shape = args[2*i + 1];
			double Rad_Or_Side = Double.parseDouble(args[2*i +2]);
			
			switch(Shape) {
			case "Circle":
			case "circle":
				arr[i] = new Circle(Rad_Or_Side);
				Sum += ((Circle)arr[i]).getArea();
				break;
			case "Cube":
			case "cube":
				arr[i] = new Cube(Rad_Or_Side);
				Sum += ((Cube)arr[i]).getArea();
				break;
			}
		}
		
			System.out.println("Drawable Areas: " + Sum);
			
	}

}
