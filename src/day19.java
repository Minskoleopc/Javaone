
public class day19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle tata = new Vehicle();
		System.out.println(tata.name);
		
		Vehicle.Sedane sd  = tata.new Sedane();
		sd.printType();
		
		Vehicle.SUV g = new Vehicle.SUV();
		g.printType();
		

	}
	


}

class Vehicle {
	
	String name = "TATA";
	
	class Sedane {
		public void printType() {
			System.out.println("Sedane");
		}
	}
	
	static class SUV {
		public void printType(){
			System.out.println("SUV");
		}
	}
	
}