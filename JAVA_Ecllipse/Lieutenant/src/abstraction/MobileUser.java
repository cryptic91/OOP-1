package abstraction;

public abstract class MobileUser {
	
	public void print() {
		System.out.println("This is abstraction");
		System.out.println("Hi Queen");
	}
	
	abstract void sendMessage();
	
}