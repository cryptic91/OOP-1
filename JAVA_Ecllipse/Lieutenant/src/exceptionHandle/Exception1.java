package exceptionHandle;

public class Exception1 {

	public static void main(String[] args) {
		
		try {
			int x = 10, y = 0;
			int result = x/y;
			
			System.out.println("Result : "+result);
			
		} 
		//sub
		catch (ArithmeticException e1) {  // ArrayIndexOutOfBoundsException <- wrong
		
			System.out.println("Exception : "+e1);
		} 
		// sub
		catch ( ArrayIndexOutOfBoundsException e2) {
			
			System.out.println("ArrayIndexOut. : "+e2);
			
		} 
		// head
		catch (Exception e) {   // playing safe
			
			System.out.println("Exception : "+e);
		}
		
		finally {  // for working rest of the lines
		
			System.out.println("Shanto");
		}
		
		System.out.println(".....END.....");

	}

}
