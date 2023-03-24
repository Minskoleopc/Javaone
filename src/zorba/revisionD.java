package zorba;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class revisionD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Array vs ArrayList

		ArrayList<String> cars = new ArrayList<String>();

		// add
		cars.add("Audi");
		cars.add("Tata");
		cars.add("BMW");
		cars.add("Tokota");
		// retrive
		System.out.println(cars.get(1));
		// update
		cars.set(2, "Ferrai");
		// delete
		cars.remove(3);

		// for Each
		for (String s : cars) {
			System.out.println(s);
		}

		// HashMap

		HashMap<String, String> capitalCities = new HashMap<String, String>();

		// add
		capitalCities.put("MH", "mumbai");
		capitalCities.put("RJ", "jaipur");
		capitalCities.put("KA", "banglore");

		// udpate
		capitalCities.put("MH", "bombay");

		// remove
		capitalCities.remove("RJ");

		// retrive
		capitalCities.get("MH");

		System.out.println(capitalCities.keySet());
		System.out.println(capitalCities.values());

		for (String key : capitalCities.keySet()) {
			System.out.println(key + " " + capitalCities.get(key));
		}

		HashMap<Integer, String> roles = new HashMap<Integer, String>();
		roles.put(1, "admin");
		roles.put(2, "customer");
		roles.put(3, "admin");
		roles.put(4, "manager");

		for (Integer key : roles.keySet()) {
			System.out.println(key + " " + roles.get(key));
		}

		System.out.println(roles.size());

		// Hashset

		// HashSet

		HashSet<String> names = new HashSet<String>();

		names.add("ram");
		names.add("ramesh");
		names.add("ram");
		names.add("raj");

		System.out.println(names);

		// retrive

		boolean a = names.contains("ram");
		System.out.println(a);

		// update

		names.remove("ram");
		System.out.println(names);

		// delete
		
		System.out.println(names.size());

		
		//names.clear();
	
		for(String aa : names) {
			System.out.println(aa);
		}
		
		

	}

}
