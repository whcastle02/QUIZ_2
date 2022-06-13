
import java.math.*;
import java.util.*;
public class Main extends Shapes{
	
	public static void main(String[] args) {
		
		int oPT = 0;
		Scanner input = new Scanner(System.in);	
			 do {
				 System.out.println("Enter 1-Area or 2-Volume  ");
				 oPT = input.nextInt();
					if (oPT > 2) {
						System.out.println("invalid option");
					}
			 }
			 while (oPT > 2);
			 Main myDisplay = new Main();
			if (oPT == 1) {
				myDisplay.Display();
				int cHOICE = input.nextInt();
					switch(cHOICE) {
					
					case 1:
						System.out.println("Please put radius");
						double radius = input.nextDouble();
						Circle c = new Circle(radius);
						System.out.println("Shape: Circle");
						System.out.print("Area: " + Math.PI + " x " + radius + " x " + radius + ": " );
						System.out.printf("%.2f" , BigDecimal.valueOf(c.area()).movePointRight(2).round(MathContext.UNLIMITED).movePointLeft(2));
						
						break;
						
					case 2:
						System.out.println("Please put length: ");
						double length = input.nextDouble();
						System.out.println("Please put width:");
						double width = input.nextDouble();
						
						Rectangle r = new Rectangle(length, width);
						System.out.println("Shape: Rectangle");
						System.out.print("Area: " + length + " x " + width + ": ");
						System.out.printf("%.2f" ,BigDecimal.valueOf(r.area()).movePointRight(2).round(MathContext.UNLIMITED).movePointLeft(2));
						break;
					case 3:
						System.out.println("Please put base: ");
						double base = input.nextDouble();
						System.out.println("Please put height:");
						double height = input.nextDouble();
						
						Triangle t = new Triangle(base, height);
						System.out.println("Shape: Triangle");
						System.out.print("Area: " + "1/2 x " + base + " x " + height + ": " );
						System.out.printf("%.2f" ,BigDecimal.valueOf(t.area()).movePointRight(2).round(MathContext.UNLIMITED).movePointLeft(2) );
						break;
					default:
						System.out.println("Invalid Option");
						break;
					}
			}
			 if (oPT == 2) {
				 
				myDisplay.Display1();
				int cHOICE = input.nextInt();
					switch(cHOICE) {
					case 1:
						System.out.println("Please put radius: ");
						double radius = input.nextDouble();
						System.out.println("Please put height:");
						double height = input.nextDouble();
		
						Cyclinder cy = new Cyclinder(radius,height);
						System.out.println("Shape: Cyclinder");
						System.out.print("Volume: " + Math.PI + " x " + radius + " x " + radius + " x " + height + ": ");
						System.out.printf("%.2f" , BigDecimal.valueOf(cy.area()).movePointRight(2).round(MathContext.UNLIMITED).movePointLeft(2));
						break;
					case 2:
						System.out.println("Please put length: ");
						double length = input.nextDouble();
						System.out.println("Please put width: ");
						double width = input.nextDouble();
						System.out.println("Please put height:");
						double Height = input.nextDouble();
						
						Cube cu = new Cube(length,width,Height);
						System.out.println("Shape: Cube");
						System.out.print("Volume: " + length + " x " + width + " x " + Height + ": ");
						System.out.printf("%.2f" , BigDecimal.valueOf(cu.area()).movePointRight(2).round(MathContext.UNLIMITED).movePointLeft(2));
						break;
					default:
						System.out.println("Invalid Option");
						break;
					}
			}
		input.close();
	}
	public void Display() {
		System.out.println("Please select the shape");
		System.out.println("1-Circle");
		System.out.println("2-Rectangle");
		System.out.println("3-Triangle");
	}
	public void Display1() {
		System.out.println("Please select the shape");
		System.out.println("1-Cyclinder");
		System.out.println("2-Cube");
	}
}

	
