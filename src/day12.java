
public class day12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator a = new Calculator();
		a.addition(12, 3); // 15
		a.addition(12, 3,4); // 19
		a.addition(12, 3,4,5); // 24
		
		PersonC c = new PersonC();
		PersonC c1 = new PersonC(2);
		PersonC c2 = new PersonC(2,2);
		PersonC c3 = new PersonC(2,5,6);
		
		
		SBI s1 = new SBI();
		s1.Saving(1);
		s1.Loan(2);
		
		SonD chinmay = new SonD("shirish","deshpande","chinmay");
		chinmay.displayName();
				
	}
	

}


class Calculator {
	
	// overloading
	
	public  void addition(int x , int y) {
		System.out.println(x+y);
	}
	
	public  void addition(int x , int y , int z) {
		System.out.println(x+y+z);
	}
	
	public  void addition(int x , int y , int z , int a) {
		System.out.println(x+y+z+a);
	}
	
		
}


class PersonC {
	
	
	public PersonC() {
		System.out.println("Default constructor is called");
	}
	
	
	public PersonC(int x) {
		System.out.println("Constructor with 1 parameter"+ x);
	}
	
	
	public PersonC(int x,int y) {
		System.out.println("Constructor with 1 parameter"+ (x+y));
	}
	
	public PersonC(int x,int y,int z) {
		System.out.println("Constructor with 1 parameter"+ (x+y+z));
	}
	
}

// overriding
// same methodName , 
//same signature ,
//different class ----- inheritance


class WorldBank {
	
	public void Saving(int x) {
		System.out.println("WorldBank saving :"+x);
	}
	
	public void Loan(int y) {
		System.out.println("WorldBank loan :"+y);
	}
}

class SBI extends WorldBank {
	
	public void Saving(int x) {
		System.out.println("SBI saving :"+x);
	}
	
	public void Loan(int y) {
		System.out.println("SBI loan :"+y);
	}
	
}

// Overriding


class FatherD {
	
	String firstName ;
	String lastName ;
		
	public FatherD(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
			
	}
	
	public void displayName(){
		System.out.println(this.firstName + this.lastName);
	}
	
}
class SonD extends FatherD{
	
	String sname ;

	public SonD(String firstName, String lastName,String sname) {
		super(firstName, lastName);
		this.sname = sname;
		
	}
	
	public void displayName(){
		System.out.println(this.sname + this.lastName);
		super.displayName();
	}
	
}






























