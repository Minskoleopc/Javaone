
public class day9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person amol = new Person();
		System.out.println(amol.fullName);
		System.out.println(amol.age);
		System.out.println(amol.adharCard);
		amol.displayName();

		// Getting the class properties outside the class

		amol.fullName = "amol rao";
		amol.age = 34;
		amol.adharCard = 72;
		amol.displayName();

		Person chinmay = new Person();
		System.out.println(chinmay.fullName);
		System.out.println(chinmay.age);
		System.out.println(chinmay.adharCard);
		chinmay.displayName();

		// Using constructor

		PersonD amolA = new PersonD("amol rao", 16, 42);
		PersonD amolB = new PersonD("amol dani", 17, 41);
		PersonD amolC = new PersonD("amol deshpande", 19, 40);

		amolA.displayName();
		amolB.displayName();
		amolC.displayName();

		amolA.fullName = "amol rao jr";
		amolA.displayName();

		// Arrays stores the value by index

		PersonD[] students = {

				new PersonD("sarika pansare", 22, 43), new PersonD("mayuri katwe", 23, 42),
				new PersonD("mayuri rao", 21, 42), new PersonD("amol dani", 21, 42), };

		students[0].displayName();

		for (PersonD a : students) {
			// a.displayName();
			System.out.println(a.adharCard);
			System.out.println(a.age);
			System.out.println(a.fullName);
		}
		
		
		PersonE poorva = new PersonE();
		System.out.println(poorva.fullName);
		System.out.println(poorva.age);
		System.out.println(poorva.adharCard);
		
		
		poorva.setFullName("poorva vyas");
		poorva.setAge(29);
		poorva.setAdharNo(123);
		
		System.out.println(poorva.fullName);
		System.out.println(poorva.age);
		System.out.println(poorva.adharCard);
		
		
		
		
		
		

	}

}

class Person {

	String fullName = "chinmay deshpande";
	int age = 30;
	int adharCard = 90;

	public void displayName() {
		System.out.println(this.fullName);
	}

}

class PersonD {
	String fullName;
	int age;
	int adharCard;

	public PersonD(String fn, int ag, int ad) {
		this.fullName = fn;
		this.age = ag;
		this.adharCard = ad;
	}

	public void displayName() {
		System.out.println(this.fullName);
	}

}

// Setter and Getter 

class PersonE {
	String fullName;
	int age;
	int adharCard;

	public void setFullName(String fn) {
		this.fullName = fn;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public void setAdharNo(int adharCard) {
		this.adharCard = adharCard;
	}

}
