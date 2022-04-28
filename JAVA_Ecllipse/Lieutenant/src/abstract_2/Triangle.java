package abstract_2;

public class Triangle extends Shape{
	
	Triangle(double x, double y){
		super(x,y);
	}
	
	void area() {
		double a = 0.5 * x * y;
		System.out.println("Area of Triangle - "+a);
	}
	
}
