
public class day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//  charAt
		
		String city = "pune";
		
		// 0   1  2  3
		// p   u  n  e
		
		for(int i = 0 ; i < city.length();i++) {
			System.out.println(i);
			System.out.println(city.charAt(i));
		}
		
		
		// 0   1   2   3  4  5
		// N   a   g   p  u  r
		String city2 = "Nagpur";
		char q1 = city2.charAt(1);
		System.out.println(q1);
		
		// length()
		
		int le = city2.length();
		System.out.println(le);
		
		// 0   1    2   3  4  5
		// N   a    g   p  u  r
		
		for(int i = 0 ; i < le ; i++) {
			//System.out.println(i);
			System.out.println(city2.charAt(i));
			// i   -- 0
			// i   -- 1
			// i   -- 2
			// i   -- 3
			// i   -- 4
			// i   -- 5
			
		}
		
	
		// Reverse the string 
		String city3  = "pune";
		String rev = "";
		// enup
		// 0   1   2   3
		// p   u   n   e
		
		for(int i = 0 ; i < city3.length() ; i++) {
			//System.out.println(city3.charAt(i));
			rev =  city3.charAt(i) + rev;
		     //       p            +  ""  =====> p
			 //       u            +   p  =====> up
			 //       n            +   up  ====== nup
			//        e            +   nup ======> enup	
		}
		System.out.println(rev);
		
		
	
		String rev2 = "";
		for(int i = city3.length()-1 ; i >= 0 ;i--) {
			System.out.println(city3.charAt(i));
			rev2 = rev2 + city3.charAt(i);
		}
		System.out.println(rev2);
		revSt("nagpur");
		revSt("pune");
		revSt("wardha");
		
	
		String fruits = "apple mango banana grapes papaya";
		String userinput = "apple";
		
		if(fruits.contains(userinput)) {
			System.out.println("Fruit available");
		}
		else {
			System.out.println("Fruit not available");
		}
		
		// program4
		String nameE = "chinmay";
		String vowels = "aeiou";
		int count = 0;
		for(int i = 0 ; i < nameE.length() ; i++) {
			if(nameE.charAt(i) == 'a' || nameE.charAt(i) == 'e'||nameE.charAt(i) == 'i' ||nameE.charAt(i) == 'o'|| nameE.charAt(i) == 'u') {
				count = count + 1;
			}
			
		}
		System.out.println(count);
		
		
		//program 4
		//          0123456789
		String h = "Javascript";
		String j = h.substring(1,5); // end value is not included
		String jq = h.substring(2); 
		String jqa = h.substring(-8,8); 
		System.out.println(j);
		System.out.println(jq);
		System.out.println(jqa);
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
		public static String revSt(String city3) {
			String rev2 = "";
			for(int i = city3.length()-1 ; i >= 0 ;i--) {
				//System.out.println(city3.charAt(i));
				rev2 = rev2 + city3.charAt(i);
			}
			System.out.println(rev2);
			return rev2;
			
		}
	

}
