import java.util.Arrays;

public class day7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numbers = new int[5];
		numbers[0] =1;
		numbers[1] =2;
		numbers[2] =3;
		numbers[3] =4;
		numbers[4] = 5;

		int [] numebersB = {1,2,3,4,5};	
		for(int i = 0 ; i < numbers.length ; i++) {
			//System.out.println(i);
			System.out.println(numbers[i]);
		}
	
		for(int s:numbers) {
			System.out.println(s);
		}
		
		// program2
		
		int [][] numbersC =  new  int[3][4];
		numbersC[0][0] = 11;
		numbersC[0][1] = 22;
		numbersC[0][2] = 33;
		numbersC[0][3] = 44;
		
		numbersC[1][0] = 11;
		numbersC[1][1] = 22;
		numbersC[1][2] = 33;
		numbersC[1][3] = 44;
		
		numbersC[2][0] = 55;
		numbersC[2][1] = 66;
		numbersC[2][2] = 77;
		numbersC[2][3] = 77;
		
		
		int [][] numbersD = {
				{11,22,33,44},
				{55,66,77,88},
				{99,110,120,130}
		};
		
		
		
//		for(int i = 0 ; i < numbersD.length ; i++) {
//			//System.out.println(Arrays.toString(numbersD[i]));
//			int [] row = numbersD[i];
//			for(int j = 0 ; j < row.length ; j++) {
//				System.out.println(row[j]);
//			}
//		}
//		
//		for(int i = 0 ; i < numbersC.length ; i++) {
//			int r [] = numbersC[i];
//			for(int j = 0 ; j < r.length ; j++) {
//				System.out.println(r[j]);
//			}
//		}
//		
		
		
		//for each
		
		for(int [] row:numbersD){
			for(int col:row) {
				System.out.println(col);
			}
		}
		
		for(int [] row:numbersC) {
			for(int col2:row) {
				System.out.println(col2);
			}
		}
		
		
		int [][][]  numbersE = {
				{
					{11,22,33},
					{44,55,66},
					{77,88,99}
				},
				{
					{111,222,333},
					{444,555,666},
					{777,888,999}
				},
				{
					{1,2,3},
					{4,5,6},
					{7,8,9}
				},
				
		} ;
		
		System.out.println(numbersE[1][1][1]);
		for(int [][] rrs:numbersE) {
			for(int [] rrr:rrs) {
				for(int r : rrr) {
					System.out.println(r);
				}
			}
		}
		
		for(int i = 0 ; i < numbersE.length ; i++) {
			int [][] rrr = numbersE[i];
			for(int k = 0 ; k < rrr.length ; k++) {
				int ccc [] = rrr[k];
				for(int j = 0 ; j < ccc.length ; j++) {
					System.out.println(ccc[j]);
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
