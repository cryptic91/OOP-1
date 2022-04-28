package abstract_2;

public class Circle extends Shape{
	
	Circle(double r){
		super(r,r);
	}
	
	void area() {
		double a = Math.PI * x*y; //Math.pow(x,y);
		System.out.println("Area - "+a);
	}
	
}
