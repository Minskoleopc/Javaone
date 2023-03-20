
public class day26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// checked exception 
		// unchecked exception 
		// user defined 
		
		System.out.println("Hello");
		try {
			System.out.println(10/5);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			System.out.println("please enter correct input");
			//e.getMessage()
		}
		System.out.println("Bye");
		
		// try catch finally
		
		
	}

}
