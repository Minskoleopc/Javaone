enum ColorM {

	GREEN, RED, YELLOW;

	private ColorM() {
		System.out.println("constructor called");
	}

	public void colorInfo() {
		System.out.println("Added information");
	}

}

public class day23C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ColorM mm = ColorM.GREEN;
		mm.colorInfo();
	}

}
