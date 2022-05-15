package Constructor;


  
         
     
	 
	  
	  

public class Constractor1 {
	  double i= 10.23;
	  Constractor1(double j){
		  System.out.println("Running class Constractor..");
		  i=j;
		  
	  }
    
    public class Cons6{
    	
    }
	public static void main(String[] args) {
		System.out.println("Main() of class Cons6 is started");
		Constractor1 b1= new Constractor1(15);
		System.out.println(" Class Constractor 1 global variable i=" +b1.i);
		// TODO Auto-generated method stub
		Constractor1 b2= new Constractor1(0.32);
		System.out.println(" golbal variablei="+b2.i);
		
      
	}

}
