package Inheritance;



class parent { 
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
		            	 rev=rev*10;
		            	 rem=num/10;
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

 class child  extends parent{
	 {
		super.reversenumber();
		super.getPalindromeNumber(123);
    System.out.println( " revers number");
	} 
	 
 
  public void  LeapYear(int year) { 
	  if (year % 4!=0) {
		  
	  }else if ( year % 400==0) {
		  
	  }else if( year % 100 == 0) {
		  
	  }else {
    System.out.println("leap year");
  }
	 
  } 
      public class Assignment8 {
	

	public  void main(String[] args) {
		
	
		// TODO Auto-generated method stub
         child c1=new child();
         c1.LeapYear(2022);
         c1.reversenumber();
         parent p1=new child();
         p1.reversenumber();
         p1.getPalindromeNumber(1234);



}
}
 }
 }