package zorba;

import java.util.HashMap;

public class CollectionDay2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// JSON
		
		HashMap<String,String> capitalCities = new  HashMap<String,String>();
		
		//add
		capitalCities.put("MH", "mumbai");
		capitalCities.put("MP", "bhopal");
		capitalCities.put("RJ", "jaipur");
		capitalCities.put("BHR", "Patna");
		capitalCities.put("UP", "Lucknow");
		
		System.out.println(capitalCities);
		
		//retrive
		
		System.out.println(capitalCities.get("MH"));
		System.out.println(capitalCities.get("RJ"));
		System.out.println(capitalCities.get("BHR"));
		System.out.println(capitalCities.get("UP"));
		
		
		//update
		capitalCities.put("MH", "Nagpur");
		capitalCities.remove("RJ");
		System.out.println(capitalCities);
		
		
		//size()
		System.out.println(capitalCities.size());
		
		
		//clear()
//		capitalCities.clear();
//		System.out.println(capitalCities.size());
		

		
		System.out.println(capitalCities.keySet());
		System.out.println(capitalCities.values());
		
		
		for(String key:capitalCities.keySet()) {
			System.out.println(key);
		}
		
		for(String val:capitalCities.values()) {
			System.out.println(val);
		}
		
		for(String key:capitalCities.keySet()) {
			System.out.println(key+" "+capitalCities.get(key));
		}
		
		// define a hashmap with interger , string
		// selenium project
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		// delete
		
		
		
		

	}

}
