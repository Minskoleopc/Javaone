
public class day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "I";
		String str2 = "learning";
		String str3  = "javascript";
		String h = String.join("@",str,str2,str3);
		System.out.println(h);
		
		
		// program 3
		//  0  1  2  3
		//  p  u  n  e
		String city = "pune";
		int q1  = city.indexOf("u");
		int q2  = city.indexOf("U");
		System.out.println(q1);
		System.out.println(q2);
		
		// 0 1 2 3 4 5 6 7 8 9 10 11  12 13 14 15
		// c h i n m a y   d e  s  p  a  n  d  e
		String firstName = "chinmay deshapandea";
		int q3 = firstName.indexOf("a",6);
		System.out.println(q3);
		
		for(int i = 0 ; i < firstName.length(); i++) {
			if(firstName.charAt(i) == 'a') {
				System.out.println(i);
			}
		}
		
		// program5
		
		String city2 = " pune ";
		System.out.println(city2.length());
		String q33 = city2.trim();
		System.out.println(q33.length());
		
		// program6
		
		String city3 = "Nagpur";
		String q44 = city3.replace("a", "i");
		System.out.println(q44);
		
		// program7
		
		String city4 = "";
		String city5 = "sanagamner";
		
		boolean em = city4.isEmpty();
		System.out.println(em);
		
		boolean em2 = city5.isEmpty();
		System.out.println(em2);
		
		
		
		
		

	}

}
