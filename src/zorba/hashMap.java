package zorba;

import java.util.HashMap;

public class hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ["chinmay","deshpande","12,13]
		/* {}
		 * 	
		 * 	{
		 * 		firstName:"chinmay",
		 * 		lastName:"deshpande",
		 * 		age:13,
		 * 		rollNo:12
		 * 		
		 * 
		 * }
		 * 
		 * 
		 * 
		 */
		
		
		HashMap<String,String> capitalCities = new HashMap<String,String>();
		
		// add )
		capitalCities.put("MH", "mumbai");
		capitalCities.put("UP", "lunknow");
		capitalCities.put("MP", "bhopal");
		capitalCities.put("HM", "shimla");
		
		System.out.println(capitalCities);
		
	
		// retrive 
		String q1 = capitalCities.get("MH");
		System.out.println(q1);
		
		// updaye
		capitalCities.put("MH", "bombay");
		System.out.println(capitalCities);
		
		// delete
		capitalCities.remove("MH");
		System.out.println(capitalCities);
		
		
		System.out.println(capitalCities.values());
		System.out.println(capitalCities.keySet());
		
		
		for(String a :capitalCities.keySet()) {
			System.out.println(a);
		}
		

		for(String b :capitalCities.values()) {
			System.out.println(b);
		}
		
		
		HashMap <Integer, String> roles = new HashMap<Integer, String>();
		roles.put(1, "admin");
		roles.put(2, "customerCare");
		roles.put(3, "support");
		roles.put(4, "manager");
		
		
	
				
		// print key as well as values
		for(int k :roles.keySet()) {
			System.out.println(k+roles.get(k));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
