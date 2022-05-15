package Day11overloding;

public class Demooverloding5 {

	public static void main(String[] args) {
		Demooverloding5 m1= new Demooverloding5();
		System.out.println("sum1:"+m1.addnumber());
		System.out.println("sum2:"+m1.addnumber(24,34));
		System.out.println("sum1:"+m1.addnumber( 34.0,67));
		System.out.println("sum1:"+m1.addnumber( 45,23,42));
		System.out.println("sum1:"+m1.addnumber( 34,67.0));
	}
		 void display() {
		
			System.out.println("I am Pune");
				
			}
			int addnumber() {
				System.out.println("addnumber()");
				int num1=10,num2=20;
			
		   System.out.println(" addnumber()before number()");
		   return num1+num2;
		  
		} 
		 int addnumber( int num1,int num2) {
			 System.out.println(" addnumber(int,int,)");
			   return num1+num2;
		
		}	 
				
		
		 double addnumber( double num1,double num2) {
			System.out.println("addnumbers(double,double)"); 
			 return num1+num2;
		 }
		 int addnumber(int num1,int num2,int num3) {
			 
			 System.out.println("addnumber(int,int,int)");
			 System.out.println("addnumber(int,int,int )before return");
			 return num1+num2;
		 }
			 
			 
		 double addnumber(int num1,double num2) {
			
			System.out.println(" addnumber(int,double,)");
			 return num1+num2; 
		 }
}
