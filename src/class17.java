
public class class17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// static property
		System.out.println(Information.country);
		// Static method
		Information.displayCountryName();
		
		Information a = new Information(12);
		
		System.out.println(a.country);
		a.displayCountryName();
		
		//Information.displayCityName();
		
		a.displayCityName();
		
	}
	
	

	
	

}

// can we called static method on reference variable 
// how can we call static methods with objects


class Information {
	
	static String country  = "India";
	int age ;
	
	public Information(int age) {
		this.age = age;
	}

	public static void  displayCountryName() {
		System.out.println(Information.country);
	}
	
	public void  displayCityName() {
		System.out.println("pune");
	}
}
