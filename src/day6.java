import java.util.Arrays;

public class day6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String [] names = new String[5];
		String names2 [] = new String[5];
		
		// array stores the value by index
		
		names[0] = "poorva";
		names[1] = "mayuri";
		names[2] = "sarika";
		names[3] = "abhisha";
		names[4] = "komal";
		
		// retrive 
		System.out.println(names[0]);
		
		for(int i = 0 ; i < names.length ; i++) {
			//System.out.println(i);
			System.out.println(names[i]);
		}
		
	String [ ] cities = {"pune","mumbai","banglore","kolkata","chennai"};
	for(int i = cities.length -1 ; i >= 0 ; i--) {
		System.out.println(i);
		System.out.println(cities[i]);
	}
		
		
	String info = "I am learning js";
	String [] sy = info.split(" ");
	String [] sy2 = info.split("a");
	
	System.out.println(sy);
	System.out.println(Arrays.toString(sy));
	System.out.println(Arrays.toString(sy2));
	//["I","am","learning","js"]
	//["I ","m le","rning js"]
		
	// program2
	
	String citif = "Nagpur";
	char [] kl = citif.toCharArray();
	// ["N","a","g","p","u","r"]
	System.out.println(kl);
	System.out.println(Arrays.toString(kl));
	
	
	// program3
	
	String [] namei =  {"amol","sarika","poorva","sachin","satish"};
	for(int i = 0 ; i < namei.length ; i++) {
		System.out.println(namei[i]);
	}
	for(String s:namei) {
		System.out.println(s);
	}
	// program4
	
	char [] nn = {'a','m','o','l'};
	String rev = "";
	// loma
	for(char s:nn) {
		//System.out.println(s);
		
		rev =  s + rev;
		//     a + ""  ===> a
		//     m + a   ===> ma
		//     o+  ma   ===> oma
		//     l + oma ====> loma
		
	}
	
	System.out.println(rev);
	
	int [] numbers = {11,33,44,55,666,7};
	float avg = 0;
	int suma = 0;
	
	for(int j:numbers) {
		//System.out.println(j);
		
		suma = suma + j;
	//	        0  +   11 ===> 11
	//          11 +   33 ===> 44
	//          44 +   44 ====> 88
	//          88 +   55 ====> 143
	//          143 +  666 ====> 809
   //           809 +   7  =====> 816
		
	}
	
	 avg = suma/numbers.length;
	System.out.println(avg);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		

	}

}
