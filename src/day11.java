
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
		
		
//		SonC chinmay = new SonC("shirish","deshpande","chinmay");
//		
//		System.out.println(chinmay.firstName);
//		System.out.println(chinmay.lastName);
//		System.out.println(chinmay.sname);
//		
//		
//		chinmay.displayName();
//		chinmay.displayCName();
		
		
		
		// Multilevel
		Sonc amol = new Sonc("manohar","deshpande","shirish","chinmay");
		System.out.println(amol.fFirstName);
		System.out.println(amol.lastName);
		System.out.println(amol.firstName);
		System.out.println(amol.sname);
		amol.displayFName();
		amol.displayGName();
		amol.displaySName();
		
		// Hierachial inheritance(one parent two child)

		
		DaughterOne a = new DaughterOne("kanchan","deshpande","gauri") ;
	
		System.out.println(a.firstName);
		System.out.println(a.lastName);
		System.out.println(a.daughterOne);
		
		a.displayDoneName();
		a.displayMName();
		
		
		DaughterTwo a2 = new DaughterTwo("kanchan","deshpande","gauri2") ;
		
		System.out.println(a2.firstName);
		System.out.println(a2.lastName);
		System.out.println(a2.daughterTwo);
		
		a2.displayDoneName();
		a2.displayMName();
		
		
		Mother kanchan = new Mother("kanchan","deshpande");
		
		//kanchan.firstName
		System.out.println(kanchan.firstName);
		System.out.println(kanchan.lastName);
		
		
		
		
		
		
		
		
		

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

//class FatherC  {
//	
//	String firstName;
//	String lastName;
//	
//	public FatherC(String a , String b) {
//			this.firstName = a;
//			this.lastName= b;		
//	}
//	
//	
//	public void displayName() {
//		System.out.println(this.firstName + this.lastName);
//	}
//}
//
//class SonC extends FatherC {
//
//	String sname ;
//	public SonC(String a, String b,String c) {
//		super(a, b);
//		this.sname  = c;
//	}
//	
//	public void displayCName() {
//		System.out.println(this.sname + this.lastName);
//	}
//	
//
//}
//



// Multi-level


class GrandFather {
	String firstName;
	String lastName ;
	
	public GrandFather(String fn , String ln) {
			this.firstName = fn;
			this.lastName = ln;
			
	}
	
	public void displayGName() {
		System.out.println(this.firstName + this.lastName);
	}
}

class FatherC extends GrandFather{
	String fFirstName;
	public FatherC(String fn, String ln,String ffn) {
		super(fn, ln);
		this.fFirstName = ffn;
	}
	public void displayFName() {
		System.out.println(this.fFirstName + this.lastName);
	}
	
}

class Sonc extends  FatherC {
	String sname;
	public Sonc(String fn, String ln, String ffn,String sfn) {
		super(fn, ln, ffn);
		this.sname = sfn;
		
	}
	public void displaySName() {
		System.out.println(this.sname + this.lastName);
	}
	
}


// Hierachical

// 1 parent ---- two childs

class Mother {
	String firstName ;
	String lastName;
	
	public Mother(String firstName,String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	} 
	
	
	public void displayMName() {
		System.out.println(this.firstName + this.lastName);
	}
}

class DaughterOne extends Mother {
	String daughterOne;
	public DaughterOne(String firstName, String lastName, String duaghterOne) {
		super(firstName, lastName);
		this.daughterOne = duaghterOne;
	}
	
	public void displayDoneName() {
		System.out.println(this.daughterOne + this.lastName);
	}
	
}


class DaughterTwo extends Mother {
	String daughterTwo;
	public DaughterTwo(String firstName, String lastName, String duaghterTwo) {
		super(firstName, lastName);
		this.daughterTwo = duaghterTwo;
	}
	
	public void displayDoneName() {
		System.out.println(this.daughterTwo + this.lastName);
	}
	
}


// program hardcoded values
// constructor 
// single inheritance
// multi level
// hierachy 
// polymorphim









