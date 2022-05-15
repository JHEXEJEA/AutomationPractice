package Ifcondition;

public class This {
     int variable=51;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         This obj = new This();
          obj.method(20);
          obj.method();
          System.out.println("Value of instance variable:"+obj.variable);
	}
	void method( int variable) {
		System.out.println("Value of local variable:"+variable);
		variable =10;
		
		System.out.println("Value of local variable:"+variable);
		System.out.println("Value of instance variable:"+this.variable);
		this.variable = variable;
		System.out.println("Value of instance variable:"+this.variable);
	}


     void method() {
    	 int variable =40;
    	 System.out.println("Value of instance variable:"+this.variable);
    	 System.out.println("Value of instance variable:"+variable);
    	 this.variable=variable;
    	 System.out.println("Value of instance variable:"+variable);
    	 System.out.println("Value of instance variable:"+this.variable);
     }
     
}