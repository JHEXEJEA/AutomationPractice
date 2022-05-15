package Day11overloding;

public class Demooverloding6 {
	
	  

		 public void squre() {
			System.out.println("No parameter method called");
			}
		 public void squre(int number) {
		 int squre =number * number;
		  System.out.println(" method with integer arrgument:"+squre);
		} 
		 public void squre( float number) {
			 float squre= number*number;
			 
			 System.out.println(" method with float arrgument:"+squre);
			 
		}
		public static void main(String[] args) {
		
		Demooverloding6 obj= new Demooverloding6();
		obj.squre(2.5f);
		obj.squre();
		obj.squre(5);
		
		}

}
	
	
	
	


		// TODO Auto-generated method stub

	


