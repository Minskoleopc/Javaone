package zorba;

import java.util.ArrayList;

public class CollectionDay1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Array is fixed length 
		// ArrayList you can modify the size
		// Object will have properties and methods
		
		ArrayList<String> cars = new ArrayList<String>();
		
		
		// add 
		cars.add("Audi");
		cars.add("BMW");
		cars.add("Maruti");
		cars.add("Honda");
		cars.add("Volvo");
		
		//retrive
		
		String first = cars.get(0);
		System.out.println(first);	
		
		// update 
		cars.set(2, "Polo");
		System.out.println(cars.get(2));
		
		// delete
		cars.remove(2);
		System.out.println(cars.get(2));
		
		
		// clear()
		// cars.clear();
		// size() of arrayList
		
		System.out.println(cars.size());
		
		System.out.println(cars);
		
		// for loop 
		
		for(int i = 0 ; i < cars.size();i++) {
			//System.out.println(i);
			System.out.println(cars.get(i));
		}
		
		// for each loop
		for(String car:cars) {
			System.out.println(car);
		}
		
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(213);
		marks.add(211);
		marks.add(212);
		marks.add(214);
		marks.add(215);
		System.out.println(marks);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	 
		
		
		
		
		//Collection 
		//ArrayList
		//Hashmap
		//Linked List
		//HashSet
		//WrapperClasses
		
		

	}

}
