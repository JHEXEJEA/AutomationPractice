package simpleprintprograms;

public class GlobalVariable5 {
      int empID=123;// non satitc global veriable
	public static void main(String[] args) {
		
		System.out.println("program starts");//30
	    GlobalVariable5 g1;
	    g1=new GlobalVariable5();
        System.out.println(" non static global variable empID:"+g1.empID);
        g1.empID=456;
        //int empID=456;// updating local variable
       // System.out.println("Upadated Direct way to access SGV,empID:"+empID);//456
        // System.out.println("Standard way to access,empID:" +GlobalVariable4.empID);
        System.out.println(" non static global variable empID:"+g1.empID);
        
        System.out.println("program end");
	}

}
