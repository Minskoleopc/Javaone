package zorba;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String > cars = new ArrayList<String>(); 
		cars.add("BMW");
		cars.add("Audi");
		cars.add("Skoda");
		cars.add("Polo");
		System.out.println(cars);
		
		// Get the iterator
		Iterator<String> a =  cars.iterator();
		
		// printing the values from iterator
//		System.out.println(a.next());
//		System.out.println(a.next());
//		System.out.println(a.next());
//		System.out.println(a.hasNext());
//		System.out.println(a.next());
//		System.out.println(a.hasNext());
		//System.out.println(a.next());
		
		
		while(a.hasNext()) {
			System.out.println(a.next());
		}
		
		// program 2
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(20);
		numbers.add(13);
		numbers.add(17);
		numbers.add(16);
		numbers.add(8);
		System.out.println(numbers);
		
		Iterator<Integer> nn  = numbers.iterator();
		
		while(nn.hasNext()) {
			if(nn.next() <15) {
				nn.remove();
			}
			
		}
		
		System.out.println(numbers);
		
		
		
		
		
		

	}

}
