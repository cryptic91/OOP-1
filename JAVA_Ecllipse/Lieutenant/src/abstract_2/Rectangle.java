package abstract_2;

public class Rectangle extends Shape{
	
	Rectangle(double x, double y){
		super(x,y);
	}
	
	@Override
	void area() {
		double a = x * y ;
		System.out.println("Area of Rectangle = "+a);
	}
	
}
