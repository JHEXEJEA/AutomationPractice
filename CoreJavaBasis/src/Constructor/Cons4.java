package Constructor;
  class B {
	  int i=10;
	  B(){
		 System.out.println("Running class Constractor..");
		 		
	  }
  

	 
		  

	public static void main(String[] args) {
		System.out.println("Main() of class Cons4 is started");
		B b1= new B();
		System.out.println(" Class Constractor 1 global variable i=" +b1.i);
		// TODO Auto-generated method stub
         B b2= new  B();
		System.out.println(" golbal variablei="+b2.i);
		

	}
		// TODO Auto-generated method stub

	}


