
public class day8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person chinmay = new Person();
//		System.out.println(chinmay.firstName);
//		System.out.println(chinmay.lastName);
//		System.out.println(chinmay.age);
//		chinmay.displayName();
//
//		Person amol = new Person();
//		System.out.println(amol.firstName);
//		System.out.println(amol.lastName);
//		System.out.println(amol.age);
//		amol.displayName();

		// setting the ptroperties outside the class

//		amol.age = 23;
//		amol.firstName = "amol";
//		amol.lastName = "rao";
//		amol.displayName();
		

		PersonB sarika  = new PersonB("sarika","pansare",24);
		PersonB poorva  = new PersonB("poorva","vyas",26);
		
		poorva.displayName();
		sarika.displayName();
		

	}

}

class PersonB {

	String firstName;
	String lastName;
	int age;

	public PersonB(String fn, String ln, int ag) {
		this.firstName = fn;
		this.lastName = ln;
		this.age = ag;
	}

	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}

}

//class Person {
//	String firstName = "chinmay";
//	String lastName = "deshpande";
//	int age = 12;
//	
//	public void displayName() {
//		System.out.println(this.firstName + this.lastName);
//	}
//}