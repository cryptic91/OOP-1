package finalQuesntion;

public abstract class SpaceCraft {
	
	protected String model;
	
	public void SpaceCraft(String model) {
		this.model = model;
	}
	
	public abstract void display();
	
}
