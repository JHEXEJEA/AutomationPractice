package Ifcondition;

public class Assignment7 {
   public static void  main(String[]arg ) {
		
		
		int num1 = 10,num2=2,result;
		int operator= 5
				;
		// System.out.println("choose an operator(+,-,*,/):");
	    
		//  scanf("%c,&ch");
		 // printf("Enter two operands:\n");
	
          // scanf("%d %d,&a,&b");

	
     switch( operator) {
     case '+':
    	 result= num1+num2;
    	System.out.println(" a+b="+result) ;
    	 break;
     case '-':
    	 result = num1-num2;
    	 System.out.println(" a-b="+result) ;  
    	 break; 
     case '*':
    	 result= num1*num2;
    	 System.out.println(" a*b="+result) ; 
    	break;
     case'/':
    	 result= num1/num2;
    	 System.out.println(" a/b="+result) ;
    	break;
    	   
    	 default:
    		 System.out.println("invalid operator");
    		 break;
     }
     
    System.out.println(" result");
    
     
     
     }

}