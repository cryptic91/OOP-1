package abstract_2;

public abstract class Shape {
	
	double x,y;
	
	public Shape(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	abstract void area();
	
}
