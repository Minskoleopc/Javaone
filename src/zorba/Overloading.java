package zorba;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//overloading
		
		addition(23,41);
		addition(23,41,45);
		addition(23,41,45,56);
		
	}

	
	public static void addition(int x , int y) {
		System.out.println(x+y);
	}
	
	public static void addition(int x , int y , int z) {
		System.out.println(x+y+z);
	}
	
	public static void addition(int x , int y , int z , int a) {
		System.out.println(x+y+z+a);
	}
	
	
	
	
	
}
