
public class day14c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBIe aa = new SBIe();
		aa.loan();
		aa.save();
		aa.repo();
	}

}

interface  WorldBankE {
	public void loan();
	public void save();
}

interface RBI {
	public void repo();
}

class SBIe implements WorldBankE , RBI {

	@Override
	public void repo() {
		// TODO Auto-generated method stub
		System.out.println("repo");
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("loan");
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("save");
	}
	
}