
public class Cube extends Shapes {
	
	private double length;
	private double width;
	private double heigth;
	
	public Cube(double length, double width, double heigth) {
		this.length = length;
		this.width = width;
		this.heigth = heigth;
		
	}
	@Override public double area() {
		return length*width*heigth;
	}
}
