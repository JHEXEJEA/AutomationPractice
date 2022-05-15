package Inheritance;
class Number{
	Number(){
		System.out.println(" number constructor");
	}
	  public  void reversenumber() {
		   int num=123,rev=0,rem=0;
		   while( num!=0) {
			   rem=num%10;
			   rev=rev*10+rem;
			   num=num/10;
		   }
		   System.out.println(" reversenumber") ; 
		
	  }
	  public void getPalindromeNumber(int num) {
		             int rev=0,rem,temp=num;
		             while(num!=0) {
		            	 rem=num%10;
		            	 rev=rev*10+rem;
		            	 num=num/10;
		             }
	System.out.println(" get PalindromeNumber");
	  }
	  public void  LeapYear(int year) { 
		  if (year % 4!=0) {
			  
		  }else if ( year % 400==0) {
			  
		  }else if( year % 100 == 0) {
			  
		  }else {
		  
			   
		  }
		  System.out.println(" leap year");
	  }
}

 class subnumber  extends Number{
	        subnumber() {
		super.reversenumber();
		super.getPalindromeNumber(123);
    System.out.println( " subnumber constructor");
	} 
	 
 
  public void  LeapYear(int year) { 
	  if (year % 4!=0) {
		  
	  }else if ( year % 400==0) {
		  
	  }else if( year % 100 == 0) {
		  
	  }else {
    System.out.println("leap year");
  }
	 
  } 
 }	
			 
public class Inheritanceoverridean2 {
	

	public  void main(String[] args) {
		
	
		// TODO Auto-generated method stub
         subnumber c1=new subnumber();
         c1.LeapYear(2022);
         c1.reversenumber();
         Number p1=new subnumber();
         p1.reversenumber();
         p1.getPalindromeNumber(1234);
	}
	
}

  




































































