package zorba;

public class Eday2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = new int[2];
		a[0] = 11;
		a[1] = 33;
		
		try {
			for(int i = 0 ; i < a.length+1 ; i++) {
				System.out.println(a[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("I will always run");
		}
		System.out.println("continue on execution");
		
	}

}
