
public class class18B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car a = new Car("audi","suv");
		Car.Auto h = a.new Auto();
		h.TypeBased();
		h.displayEngine();
		
	}
	
}

class Car {
	
	String name ;
	String ty;
	
	public Car(String nm , String ty) {
		this.name = nm;
		this.ty = ty;
	}
	
	private  String getCar() {
		return this.name;
	}
	
	class Auto {
		
			String engine;
			public String TypeBased() {
	
				if(Car.this.ty.equals("suv")){
					this.engine = "Bigger";
				}
				else if(Car.this.ty.equals("sedane")) {
				
					this.engine = "Smaller";
				}
				else {
					this.engine = "default";
				}
				
				return this.engine;
				
			}
			
			void displayEngine() {
				System.out.println(this.engine);
			}
		
		
	}
	
	

	
}
