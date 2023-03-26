package zorba;

import java.util.ArrayList;
import java.util.HashSet;

public class hashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int [] numbers = {11,22,33,44,22};
		
		HashSet<String> names = new HashSet<String>();
		names.add("chinmay");
		names.add("sarika");
		names.add("ram");
		names.add("satish");
		names.add("poorva");
		names.add("sarika");
		
		names.iterator();
				
		System.out.println(names);
		names.remove("poorva");
		System.out.println(names);
		
		boolean aa = names.contains("ram");
		boolean bb = names.contains("Ram");
		
		
		System.out.println(aa);
		System.out.println(bb);
		
//		names.clear();
//		System.out.println(names);
//		
		System.out.println(names.size());
		
		for(String name:names) {
			System.out.println(name);
		}
		
		ArrayList <String> names2 = new ArrayList<String>();
		names2.add("sarika");
		//names2.add("poorva");
		
		
		for(int i = 0 ; i < names2.size() ; i++) {
			if(names.contains(names2.get(i))) {
				System.out.println(names2.get(i)+" element  available on set");
			}
			else {
				System.out.println(names2.get(i)+" element not available on set");
			}
		}
		
		
		
	
		
		
		
		
		
		
		
		
		
	}

}
