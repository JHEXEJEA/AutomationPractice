package simpleprintprograms;

public class Method5 {

	public static void main(String[] args) {
		System.out.println("Result of addition:"+getadditionresult(250.30,45));
		System.out.println("Result of addition:"+Method5.getadditionresult(250.36,45));
         
      
	   
	}
     static double getadditionresult(double num1,double num2) {
    	System.out.println("Number1is:"+num1); 
    	 System.out.println("Number2is:"+num2);
    	 double res = num1+num2;
    	 return res;
     }
	
	
}
