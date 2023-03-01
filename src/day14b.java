
public class day14b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SBID aa  =  new SBID();
		
		aa.discount();
		aa.save();
		aa.loan();


	}

}

interface WorldBankD {
	
	abstract public void loan();
	abstract public void save();
	abstract public void discount();
	
}

class SBID implements WorldBankD {
	
	// we cannot create object of interface

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("Loan SBI");
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("save SBI");
	}
	

	@Override
	public void discount() {
		// TODO Auto-generated method stub
		System.out.println("discount SBI");
	}
	
}