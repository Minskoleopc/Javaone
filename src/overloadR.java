
public class overloadR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Cal n = new Cal();
		n.addition(12, 13);
		n.addition(12, 13,14);
		n.addition(12, 13,14,356);
	}

}

class Cal {
	
	// same class 
	// same method  name
	// Different signature
	
	public void addition(int x, int y) {
		System.out.println(x+y);
	}
	
	public void addition(int x, int y ,int z) {
		System.out.println(x+y+z);
	}
	public void addition(int x, int y ,int z ,int a) {
		System.out.println(x+y+z+a);
	}
	
}
