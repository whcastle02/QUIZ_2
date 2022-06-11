
public class Cyclinder extends Shapes {
	
	private double radius;
	private double height;
	
	public Cyclinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	@Override public double area() {
		return Math.PI*Math.pow(radius, 2)*height;
	}

}
