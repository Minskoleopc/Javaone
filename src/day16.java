
public class day16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PNBee pnb = new PNBee("pune","india");
		pnb.card();
		pnb.discount();
		pnb.loan();
		pnb.discount();
		pnb.loan();

	}

}

interface  WB{
	
	public void save();
	public void loan();
	public void discount();
}

abstract  class SBIee {
	String city ;
	String country;
	
	public SBIee(String cty , String cnt) {
		this.city = cty;
		this.country  = cnt;
	}
	
	abstract public void card();
	
	public void displayCountry() {
		System.out.println(this.country);
	}
	
}

class PNBee extends  SBIee  implements WB {

	public PNBee(String cty, String cnt) {
		super(cty, cnt);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("SBI save");
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("SBI loan");
	}

	@Override
	public void discount() {
		// TODO Auto-generated method stub
		System.out.println("discount");
	}

	@Override
	public void card() {
		// TODO Auto-generated method stub
		System.out.println("card..");
	}
	
	
	
}