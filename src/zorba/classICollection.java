package zorba;

import java.util.ArrayList;

public class classICollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// add
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Audi");
		cars.add("BMW");
		cars.add("Maruti");
		cars.add("Tata");
		cars.add("Honda");
		System.out.println(cars);
		
		// retrive
		String car1 = cars.get(0);
		System.out.println(car1);
		
		// update 
		cars.set(2,"Nissan");
		System.out.println(cars);
		
		//remove
		
		cars.remove(0);
		System.out.println(cars);
		
		
		// for loop
		
		for(int i = 0 ; i < cars.size(); i++) {
			//System.out.println(i);
			System.out.println(cars.get(i));
		}
		
		// for each
		for(String a:cars) {
			System.out.println(a);
		}
		
		
		
		
		
		
		
		
	}

}
