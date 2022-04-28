package absFromDiagram;

public class Volvo extends Vehicle implements Drive {

	@Override
	public void startEngine() {
		System.out.println("Start your engine");
	}

	@Override
	public void stopEngine() {
		System.out.println("Stop your engine");
	}

	@Override
	public void display() {
		System.out.println("Welcome to car world");
	}

	private double price;
	
	public void Volvo (double price) {
		this.price = price;
	}

	public static void main(String[] args) {
		
		Vehicle v1 = new Volvo();
		v1.display();
		
		Drive d = new Volvo();
		d.startEngine();
		d.stopEngine();

	}

	

}
