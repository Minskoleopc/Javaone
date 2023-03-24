package zorba;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// HashMap
		// ArrayList
		// HashSet
		// LinkedList
		// Iterator
		
		
		ArrayList<String> countries = new ArrayList<String>();
		
		countries.add("india");
		countries.add("usa");
		countries.add("nepal");
		countries.add("srilanka");
		
		Iterator <String> ii = countries.iterator();
		
//		System.out.println(ii.next());
//		System.out.println(ii.next());
//		System.out.println(ii.next());
//		System.out.println(ii.hasNext());
//		System.out.println(ii.next());
//				
		while(ii.hasNext()) {
			System.out.println(ii.next());
		}
		
		
		// program2
		
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(13);
		numbers.add(15);
		numbers.add(16);
		numbers.add(18);
		numbers.add(8);
		numbers.add(7);
		numbers.add(71);
		
		//numbers.remove(0)
		for(int i = 0 ; i < numbers.size()+1 ; i++) {
			if(numbers.get(i) < 10) {
				numbers.remove(i);	
				//System.out.println(numbers);
			}
		}
		//System.out.println(numbers);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
