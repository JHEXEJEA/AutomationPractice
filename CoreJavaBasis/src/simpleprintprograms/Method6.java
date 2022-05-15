package simpleprintprograms;

public class Method6 {
      static int age1;
      static double salary1=2536.67;
      int age2;
      double salary2=5672.78;
      
	 void display() {
		System.out.println(" Hello I am disply()");

	}
      double getinterest2(int ammount,int numbers,double sal) {
    	 System.out.println("Hello I am getinterest2(int,int,double)");
    	 return 2536.67;
    }
      
     static void display2() {
    	 System.out.println("Hello I am display2()");
     }
     
     static double getinterest3( int ammount,int numner,double sal) {
    	System.out.println(" Hello I am getinterest2(int,int,double)"); 
       return 5672.78;
     }  
     
       public static void main(String[] arg) {
    	int empID=561;
    	double salary1=52000.0;
    	System.out.println(" local variable"+empID);
    	System.out.println("local variable"+salary1);
    	System.out.println("int age:"+Method6.age1);
    	System.out.println("salary1:"+Method6.salary1);
    	Method6 G1 =new Method6();
    	System.out.println(" AGE:"+G1.age2);
    	System.out.println("salary:"+G1.salary2);
    	
    }
    	
    }
