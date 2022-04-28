package absFromDiagram;

public abstract class Vehicle {
	
	protected String model;
	
	public void Vehicle (String model) {
		this.model = model;
	}
	
	public abstract void display();

}
