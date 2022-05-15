package Day11overloding;



public class Demooverloding3 {
	static double res;
	static public void squre() {
		System.out.println("No parameter method called");
		}
	static public void squre(int number) {
	  res= number * number;
	  System.out.println(" method with integer arrgument:"+res);
	} 
	static public void squre( double number) {
		 res= number * number;
		 System.out.println(" method with float arrgument:"+res);
	}
	

	public static void main(String[] args) {
	System.out.println("Result:"+res);
	
	Demooverloding3.squre(2.5f);
	Demooverloding3.squre();
	Demooverloding3.squre(5);
	System.out.println("Result:"+res);
	}

}
			