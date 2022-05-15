package Day11overloding;

public class Demooverloding4 {

	public static void main(String[] args) {
		
       
       System.out.println("sum:1"+addnumbers());
       System.out.println("sum:2"+Demooverloding4.addnumber(10.1,20));
       System.out.println("sum:3"+Demooverloding4.addnumber(20,45,89));
	}	
	 static int addnumbers () {
		
			System.out.println("addnumber");
			int num1=10,num2=20;
			
		   System.out.println(" addnumber()before number()");
		   return num1+num2;
		  
		} 
		static int addnumber( int num1,int num2,int num3) {
			 System.out.println(" addnumber(int,int,int)");
			   return num1+num2;
		
		}	 
				
		
		static double addnumber( double num1,double num2) {
			
			System.out.println(" addnumber(int,double,)");
			 return num1+num2; 
		
		}
		// TODO Auto-generated method stub

	
}

