package abstraction;

public class Main {

	public static void main(String[] args) {
		
//		MobileUser m = new MobileUser(); 

		MobileUser m = new Shanto();
		m.sendMessage();
		m.print();
		
		MobileUser m1 = new Rakib();
		m1.sendMessage();
		m1.print();
		
	}

}
