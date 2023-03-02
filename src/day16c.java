
public class day16c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DDf kkl = new DDf();
		kkl.greet();
		kkl.ZZ();
		kkl.greet(33);
	}
}
interface ZZ {
	public void ZZ();
	default void greet() {
		System.out.println("hello");
	}
	
	default void greet(int x) {
		System.out.println("hello"+x);
	}
}

class DDf implements ZZ {

	@Override
	public void ZZ() {
		// TODO Auto-generated method stub
		System.out.println("bye");
	}
	
}
