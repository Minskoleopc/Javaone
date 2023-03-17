package zorba;

public class Eday1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 15;
		int b = 0;
		System.out.println("hello");
		try {
			System.out.println("In try");
			System.out.println(a/b);
		}
		catch(ArithmeticException e){
			
			System.out.println("in catch");	
			e.printStackTrace();
			String a1 = e.toString();
			System.out.println(a1);
			
		}
		
		System.out.println("bye");

	}

}
