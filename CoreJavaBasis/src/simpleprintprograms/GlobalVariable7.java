package simpleprintprograms;

public class GlobalVariable7 {
	int empID=123;

	public static void main(String[] args) {
	 System.out.println("program starts");
	 GlobalVariable7 g1;
	 g1= new GlobalVariable7();
	 System.out.println("Non static global variable empID: "+g1.empID);
	 g1. empID=456;
	 System.out.println(" updated Non static global variable empID: "+g1.empID);
	 
	 GlobalVariable7 g2=new GlobalVariable7();
	 System.out.println(" updated Non static global variable empID: "+g2.empID);

	}

}
