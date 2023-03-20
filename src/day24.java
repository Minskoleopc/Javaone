
public class day24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello");
		try {
			int [] a = new int [2];
			a[0]= 33;
			a[1]= 44;
			System.out.println(a[2]);
					
			System.out.println(10/0);
			
		}
		catch(ArithmeticException e) {
			System.out.println("incorrect input from user");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally will always run");
		}
	
		System.out.println("Bye");
		

	}

}
