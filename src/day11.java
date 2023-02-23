
public class day11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Father shirish = new Father();
//		System.out.println(shirish.firstName);
//		System.out.println(shirish.lastName);
		//System.out.println(shirish.age);
		//shirish.displayName()
		
		//shirish.displayNameAge();
		
//		FatherB a  = new FatherB();
//		System.out.println(a.firstName);
//		System.out.println(a.lastName);
//		//System.out.println(a.sname);
//		
//		
//		Son chinmay = new Son();
//		
//		System.out.println(chinmay.firstName);
//		System.out.println(chinmay.lastName);
//		System.out.println(chinmay.sname);
//		
//		chinmay.displayName();
//		chinmay.displaySName();
		
		
		SonC chinmay = new SonC("shirish","deshpande","chinmay");
		
		System.out.println(chinmay.firstName);
		System.out.println(chinmay.lastName);
		System.out.println(chinmay.sname);
		
		
		chinmay.displayName();
		chinmay.displayCName();

	}

}

//class Father {
//	
//	String firstName = "shirish";
//	String lastName = "deshpande";
//	private int age = 10;
//	
//	private void displayName(String fn , String ln) {
//		this.firstName = fn;
//		this.lastName = ln;
//	}
//	
//	public void displayNameAge() {
//		System.out.println(this.age);
//		this.displayName("chinmay", "deshpande");
//	}
//	
//}

//
//class FatherB {
//	
//	String firstName = "shirish";
//	String lastName = "deshpande";
//	
//	public void displayName() {
//		System.out.println(this.firstName + this.lastName);
//	}
//}
//
//class Son extends FatherB {
//	
//	String sname= "chinmay";
//	
//	public void displaySName() {
//		System.out.println(this.sname + this.lastName);
//	}
//	
//}

class FatherC  {
	
	String firstName;
	String lastName;
	
	public FatherC(String a , String b) {
			this.firstName = a;
			this.lastName= b;		
	}
	
	
	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
}

class SonC extends FatherC {

	String sname ;
	public SonC(String a, String b,String c) {
		super(a, b);
		this.sname  = c;
	}
	
	public void displayCName() {
		System.out.println(this.sname + this.lastName);
	}
	

}







