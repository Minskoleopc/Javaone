import java.util.Arrays;

public class day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num [] = new int[5];
		int [] num2 = new int[5];
		
		num[0] = 99;
		num[1]= 100;
		num[2] = 101;
		num[3] = 102;
		num[4]=  105;
		
		System.out.println(num);
		//System.out.println(Array);
		String q55 = Arrays.toString(num);
		System.out.println(q55);	
		
	
		for(int i = 0 ; i < num.length ; i++) {
			System.out.println(i);
			System.out.println(num[i]);
		}
		
		
		int [] num3 = {11,22,33,44,55};
		
		for(int i = 0 ; i < num3.length ; i++) {
			System.out.println(i);
			System.out.println(num3[i]);
		}
		
				
		
		
		

	}

}
