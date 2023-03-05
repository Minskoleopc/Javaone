
public class day17B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Humans a = new Humans("chinmay","12");
		Humans b = new Humans("chinmay","13");
		Humans c = new Humans("chinmay","11");

		
		//System.out.println(Humans.objectCount);
		
		Humans.countObj();
	}

	
	// count the number of objects created by class
	
	

}


class Humans {
	
	static int objectCount = 0  ;
	String fullName;
	String age ;
	
	
	public Humans(String fullName , String age) {
		this.fullName = fullName;
		this.age = age;	
		//objectCount = objectCount+ 1;
		increaseObjCount();
	}
	
	public  static void countObj() {
		System.out.println(Humans.objectCount);
	}
	
	public  static void increaseObjCount() {
		objectCount = objectCount+ 1;
	}
	
	
	
	

}