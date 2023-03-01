
public class day14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SBIb aaa = new SBIb("India","pune",222);
		

		System.out.println(aaa.city);
		System.out.println(aaa.country);
		System.out.println(aaa.pincode);
		
		aaa.loan();
		aaa.save();
		aaa.displayCountryName();
		
		PNBb jj = new PNBb("India","pune");
		System.out.println(jj.city);
		System.out.println(jj.country);
		
		jj.save();
		jj.loan();
		jj.displayCountryName();
		
		
	}
	
	// Abstraction --- data hide

}


abstract class WorldBanka {
	
	String city ;
	String country;
	
	
	public WorldBanka(String cty , String cn) {
		this.city = cty;
		this.country  = cn;
	}
	
	
	// abstract method 
	abstract public void save();
	abstract public void loan();
	
	public void displayCountryName(){
		System.out.println("India");
	}
	
	
	// we cannot create object of abstract class
	
}

class SBIb extends  WorldBanka{
	int pincode ;
	public SBIb(String cty, String cn , int pincode) {
		super(cty, cn );
		this.pincode = pincode;
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("Save method SBI");
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("Loan method SBI");
	}
	
	
}

class PNBb extends  WorldBanka{

	public PNBb(String cty, String cn) {
		super(cty, cn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("SAVE pnb");
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("Loan pnb");
	}
	
	
}







