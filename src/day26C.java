import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class day26C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numbers = new int[3];
		
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		
//		try {
//			System.out.println(numbers[3]);
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println(e);
//			System.out.println("please enter within the rangel");
//		}
		
		try {
			File file = new File("C:\\Users\\pankaj\\Desktop\\test.txt");
			BufferedReader br
            = new BufferedReader(new FileReader(file));
			
		}
		catch(FileNotFoundException e){
			System.out.println("File not found");
			e.printStackTrace();
			System.out.println("please select correct path");
		}
		
		

		
		
	}

}
