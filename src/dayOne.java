
public class dayOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		System.out.println(x);
		
		String firstName = "chinmay";
		System.out.println(firstName);
		
		// Arithmetic operation
		
		// + , - , * ,/ ,%
		
		int a = 100;
		int b = 50;
	
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println(22%7);
		
		int x1 = 10;
		int y1 = 5;
		
		System.out.println(x1+y1);
		System.out.println(x1-y1);
		System.out.println(x1*y1);
		System.out.println(x1/y1);
		System.out.println(x1%y1);
		
		  // functions
		 // 10 pair == 50 lines
		
		 Calculator(12,4);
		 Calculator(6,3);
		 
		 Addition();
		 Addition();
		 Addition();
		 Addition();
		 Addition();
		 
		 AdditionB(12,5);
		 AdditionB(12,33);
		 AdditionB(12,50);
		 AdditionB(12,3);
		 
		
		int a11 = AdditionC(234,5);
		System.out.println(a11);
		System.out.println(a11 * 0.10);
		System.out.println(a11 - 10);
		
	}
	
	public static void Calculator(int x , int y) {
			System.out.println(x+y);
			System.out.println(x-y);
			System.out.println(x*y);
			System.out.println(x/y);
			System.out.println(x%y);
	}
	
	// Basic functions 
	
	// function with parameter and with return return type 
	
	public static void Addition() {
		System.out.println(9+9);
	}
	
	// function parameter with return type
	
	
	public static void AdditionB(int x, int y) {
		System.out.println(x+y);
	}
	
	// function with parameter and with return type
	
	public static int AdditionC(int x , int y) {
		return x + y;
	}
	
	
	
	
	
	

}
