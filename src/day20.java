
public class day20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Vehicle2 v1 = new Vehicle2();
//		Vehicle2 v2 = new Vehicle2();
//		
		
		//Vehicle2 v2 = new Vehicle2();
		
		Vehicle2.createInstance();
		Vehicle2.createInstance();
		Vehicle2.createInstance();
		Vehicle2.createInstance();


	}

}

class Vehicle2 {
	
	String color = "red";
	static Vehicle2 v1;
	
	private Vehicle2(){
		
	}
	
	public static Vehicle2 createInstance(){
		if(v1 == null) {
			System.out.println("hello");
			v1 = new Vehicle2();
		}
		
		return v1;
	}
	
	
	
}
