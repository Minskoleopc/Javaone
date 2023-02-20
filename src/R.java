
public class R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Poorva";
		//["P","o","o","r","v" ,"a"]
	     char [] aa =	a.toCharArray();
	     for(char a1:aa) {
	    	 System.out.println(a1);
	     }
		
		  // conditional statements
	     // numT > 0 && numT <= 5   ===>  10 %discount
	     // numT > 5 && numT <= 10   ===> 20 %discount
	     // numT > 10   ===>  30 % discount
	     
	     int numT = 5;
	     if(numT > 0 && numT <= 5) {
	    	 System.out.println("10% discount");
	     }
	     if(numT > 5 && numT <= 10) {
	    	 System.out.println("20% discount");
	     }
	     if(numT > 10 ) {
	    	 System.out.println("30% discount");
	     }
	     
	     
	     int numT2 = 11;
	     if(numT2 > 0 && numT2 <= 5) {
	    	 System.out.println("10% discount");
	     }
	     else if(numT2 > 5 && numT2 <= 10) {
	    	 System.out.println("20% discount");
	     }
	     else if(numT2 > 10 ) {
	    	 System.out.println("30% discount");
	     }
	     else {	
	    	 System.out.println("Please enter correct input");
	     }
	     
	     int marks = 92;
	     
	     if(marks > 90) {
	    	 System.out.println("Grade A");
	     }
	     if(marks > 75) {
	    	 System.out.println("Grade B");
	     }
	     if(marks > 60) { 
	    	 System.out.println("Grade c");
	     }
	    	
	     
	     if(marks > 90) {
	    	 System.out.println("Grade A");
	     }
	     else if(marks > 75) {
	    	 System.out.println("Grade B");
	     }
	     else if(marks > 60) { 
	    	 System.out.println("Grade c");
	     }
	    	
	     
	     // conditional statements 
	     
//	     if(condition) {
//	    	 // statament
//	     }
//	     else {
//	    	 // statement
//	     }
//	      
	     int a1 = 10;
	     int b1 = 50;
	    
	     if(a1 > b1) {
	    	 System.out.println("a1 is greater");
	     }
	     else {
	    	 System.out.println("b1 is greater");
	     }
	     
	    String y =  a1 > b1 ? "a1 is greater":"b1 is greater";
	    System.out.println(y);
	    
	    
	    int s1 = 89000;
	    int s2 = 999;
	    int s3 = 100;
	    
	    
//	    if(s1 > s2 && s1 > s3) {
//	    	System.out.println("s1 is greater");
//	    }
//	    else if(s2 > s1 && s2 > s3) {
//	    	System.out.println("s2 is greater");
//	    }
//	    else {
//	    	System.out.println("s3 is greater");
//	    }
//	    
	    if(s1 > s2) {
	    	if(s1 > s3) {
	    		System.out.println("s1 is greater");
	    	}
	    }
	    else if( s2 > s1) {
	    	if(s2 > s3) {
	    		System.out.println("s2 is greter");
	    	}
	    	else {
	    		System.out.println("s3 is greater");
	    	}
	    }
	    
	    // Switch case 
	    
	    
	    String city = "nagpur";
	    
	    
//	    switch(city){
//	    	case "pune":
//	    		System.out.println("MH");
//	    	case "indore":
//	    		System.out.println("MP");
//	    	case "jaipur":
//	    		System.out.println("RJ");
//	    	default:
//	    		System.out.println("Incorrect city name");
//	    }
	    
//	    switch(city){
//    	case "pune":
//    		System.out.println("MH");
//    		break;
//    	case "indore":
//    		System.out.println("MP");
//    		break;
//    	case "jaipur":
//    		System.out.println("RJ");
//    		break;
//    	default:
//    		System.out.println("Incorrect city name");
//    }
	    
	    
	    switch(city){
    	case "pune":
    	case "nagpur":
    		System.out.println("MH");
    		break;
    	case "indore":
    	case "bhopal":
    		System.out.println("MP");
    		break;
    	case "jaipur":
    	case "udaipur":
    		System.out.println("RJ");
    		break;
    	default:
    		System.out.println("Incorrect city name");
    }
	    
	    
	   System.out.println(1);
	   System.out.println(2);
	   System.out.println(3);
	   System.out.println(4);
	   System.out.println(5);
	   
	   
	   // for and while
	   
	   
	   // for(initialization ; conditionCheck , increment/Decrement){

	   // statements
	   
	   
	   
	   for(int i = 0 ; i <=3 ; i++) { //1 // 2 //3 // 4
		   System.out.println(i); // 0 , 1 , 2  ,3
	   }
	   
	   for(int i = 0 ; i <=3 ; i++) { 
		   System.out.println("hello"); 
	   }
	   
	   for(int i = 1 ; i <=5 ; i++) { 
		   System.out.println(i); 
	   }
	   for(int i = 5 ; i >= 1 ; i--) { 
		   System.out.println(i); 
	   }
	   for(int i = 4; i <= 40 ; i = i + 4) { 
		   System.out.println(i); 
	   }
	   
	  
	   for(int i = 1 ; i <=5 ; i++) {  // 2 //3
		   if(i == 3) {
			   break;
		   }
		   System.out.println(i);  //1 // 2
	   }
	   
	   
	   for(int i = 1 ; i <=5 ; i++) {  
		   System.out.println(i);  
		   if(i == 3) {
			   break;
		   }
	   }
	   
	   for(int i = 1 ; i <=5 ; i++) {  
		   if(i == 3) {
			   continue;
		   }
		   System.out.println(i); 
	   }
	   
	   int q1 = 1;
	   while (q1 <= 5) {
		   System.out.println(q1); //1 // 2 // 3 // 4 // 5
		   q1 =  q1 + 1; //1 // 2 // 3 // 4 // 5
//		   q1 ++;
//		   q1 += 1;
	   }
		
	   
	   // print hello 5 times
	   
	   int q2 = 1;
	   while(q2 <= 5) {
		   System.out.println("hello");
		   q2++;
	   }
	   
	   // print 5 to 1
	   int q3= 5;
	   while(q3 >= 1) {
		   System.out.println(q3);
		   q3 --;
	   }
	   // print table of 2
	   int q4 = 2 ;
	   while(q4 <= 20) {
		   System.out.println(q4);
		   q4 = q4 + 2;
	   }
	   
	   int q41 = 2 ;
	   while(q41 <= 20) {
		   if(q41 == 6) {
			   break;
		   }
		   System.out.println(q41); // 2 // 4
		   q41 = q41 + 2; // 4 // 6
	   }
	   
	  
	   
	   int q5 = 1;
	   while(q5 <= 5) {
		   if(q5 == 2) {
			   q5 ++; // 3
			   continue;
		   }
		   System.out.println(q5); //1 // 3 // 4 // 5
		   q5 = q5 + 1; // 2 // 4 // 5 // // 6
	   }
	   
	   
	   
	   
	   
	   
	  
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	    
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	 
		// while loop 
		
		// For loop 
		
		// ForEach 
		

	}

}
