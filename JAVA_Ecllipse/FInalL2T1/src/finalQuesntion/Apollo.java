package finalQuesntion;

public class Apollo extends SpaceCraft implements Drive,Shuttle{

	public void display() {
	}
	
	public void drive() {
	
	}
	public void stop() {
		
	}
	public void turn() {
		
	}
	
	public void startShuttle() {
		
	}
	public void stopShuttle() {
		
	}
	
	
	private int nowheel;
	
	public void Apollo (int nowheel) {
		this.nowheel = nowheel;
	}
	
	public static void main (String [] args) {
		
		SpaceCraft s = new Apollo();
		s.display();
		
		Drive d = new Apollo();
		d.drive();
		d.stop();
		d.turn();
		
		Shuttle st = new Apollo();
		st.startShuttle();
		st.stopShuttle();
		
	}
	
}
