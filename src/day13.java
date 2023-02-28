
public class day13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		CalculatorB a = new CalculatorB();
//		
//		a.addition(12, 13);
//		int e = a.addition(12, 13 ,23);
//		System.out.println(e);
//		a.addition(12, 13 ,23,14);
		
		// Constructor overloading 
		
//		PersonY aaa = new PersonY();
//		PersonY aaaa = new PersonY(34,66);
//		PersonY aaaaa = new PersonY(45,66,77);
		
		
		// Over riding 
		
		SBIM  sbia = new SBIM("India","Pune",2,411028);
		System.out.println(sbia.city);
		System.out.println(sbia.country);
		System.out.println(sbia.pinCode);
		
		sbia.Save(12);
		sbia.Loan(14);

	}

}
//
//class CalculatorB {
//	
//	// same class 
//	// same methodName
//	// different signature
//	// overloading
//	
//	public void addition(int x, int y) {
//		System.out.println(x+y);
//	}
//	
//	public int addition(int x, int y ,int z) {
//		System.out.println(x+y+z);
//		return x+y+z;
//	}
//	
//	public void addition(int x, int y ,int z ,int a) {
//		System.out.println(x+y+z+a);
//	}
//
//}


class PersonY {
	
	// Default constructor
	public PersonY() {
		System.out.println("Default constructor called ....");
	}
	public PersonY(int x , int y) {
		System.out.println("Default constructor called  2 Param....");
		System.out.println(x+y);
	}
	public PersonY(int x , int y ,int z) {
		System.out.println("Default constructor called  3 param....");
		System.out.println(x+y+z);
	}
	
	
}


// Overriding

// Different class 
// Same method Name 
// Same signature ---- has a relationship 


class WorldBankB{
	
	String country;
	String city ;
	int loan ;
	
	public WorldBankB(String cn , String cty ,int loan) {
			this.country = cn;
			this.city = cty;
			this.loan = loan;
			
	}
	
	public void Loan(int x ) {
		System.out.println("WB loan"+ x);
	}
	
	public void Save(int y ) {
		System.out.println("WB save"+ y);
	}
	
}

class SBIM extends WorldBankB {

	int pinCode;
	public SBIM(String cn, String cty,int loan, int pinCode) {
		super(cn, cty , loan);
		this.pinCode = pinCode;
		// TODO Auto-generated constructor stub
	}
	
	public void Loan(int x ) {
		System.out.println("SB loan"+ x);
		super.Loan(x-2);
	}
	
	public void Save(int y ) {
		System.out.println("SB save"+ y);
		super.Save(99);
	}
	
}
















