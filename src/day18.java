
public class day18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Grocery fr = new Grocery();
		System.out.println(fr.price);
		
		Grocery.Fruits fruitone =  fr.new Fruits();
		System.out.println(fruitone.supplier);
		System.out.println(fruitone.vendor);		
		fruitone.City();
		
		Grocery.Vegetable vegOne = fr.new Vegetable();
		System.out.println(vegOne.supplier);
		System.out.println(vegOne.vendor);		
		vegOne.City();
		
		
		
		
		

	}

}


class Grocery {
	
	int price = 10;
	
	class  Fruits {
		
		String supplier = "mappo";
		String vendor = "adani";
		
		public void City() {
			System.out.println("Supplier from pune");
		}
	}

	protected class Vegetable {		
		String supplier = "mappo2";
		String vendor ="adani";
		
		public void City() {
			System.out.println("Vendor from pune");
		}
		
	}
	
	
}