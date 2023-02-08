
public class dayTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstName = "I am learning selenium";
		System.out.println(firstName);
		//System.out.println(firstName[0]);
		
		// String +  Integer =====> String 
		// Integer + String  =====> String 
		// String  + String  =====> String 
		// Integer + Integer ====> Integer
		
		System.out.println("Hello"+2);  // "Hello2"
		System.out.println("2"+2);  // "22"
		System.out.println(4+2);  // 6
		System.out.println("5"+"66");  // 566
		
		// Methods
		
		String firstName2 = "rohan";
		int q1 = firstName2.length();
		System.out.println(q1);
		
		
		// program3
		
		String firstName3 = "poorva";
		String lastName3 = "vyas";
		String  q2 = firstName3.concat(lastName3);
		System.out.println(q2);
		System.out.println(firstName3+lastName3);
			
		// program 4
		
		String city  = new String("pune");
		System.out.println(city);
		
		// program 5
		
		String city2 = "Nagpur";
		String q21  = city2.toUpperCase();
		System.out.println(q21);
		
		// program 6
		
		String city3 = "Wardha";
		String q22 = city3.toLowerCase();
		System.out.println(q22);
		
		// Method chaining
		
		String city4 = "Jaipur";
		city4.toUpperCase().toLowerCase().length();
		// "JAIPUR".toLowerCase() ====> "jaipur".length()===>6.toUpperCase()
		
		// program 7
		
		String city5 = "pune";
		String city6 = "pune";
		String city7 = "mumbai";
		
		System.out.println(city5.equals(city7));
		System.out.println(city5.equals(city6));
		
//		if(city5.equals(city6)) {
//			System.out.println("same city");
//		}
//		else {
//			System.out.println("diffent city");
//		}
		
//		if(city5.equalsIgnoreCase(city6)) {
//			System.out.println("same city");
//		}
//		else {
//			System.out.println("diffent city");
//		}
		
		String a = city5.equals(city7) ? "equal":"not equal";
		System.out.println(a);
		
		
		// Program 8
		
		String city8 = "ujjain";
		boolean q33 = city8.startsWith("u");
		boolean q34 = city8.startsWith("Ujj");
		System.out.println(q33);
		System.out.println(q34);
		
		// program 9
		
		String city9 = "delhi";
		boolean q333 = city9.endsWith("i");
		boolean q344 = city9.endsWith("hi");
		System.out.println(q333);
		System.out.println(q344);
		

		
		// program 10
		String j = "I am learning java";
		boolean q55 = j.contains("am");
		System.out.println(q55);
		
		
		
		
		
	}

}
