
public class day26B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstName = null  ;
		System.out.println(firstName);
		
		try {
			System.out.println(firstName.charAt(0));
		}
		catch(NullPointerException e) {
			System.out.println("Please initialize the value");
		}
		catch(Exception e) {
			System.out.println("exception handled");
			e.printStackTrace();
		}
		finally {
			System.out.println("This block will always execute");
		}
		
		

	}
	
	

}
