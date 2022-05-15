package simpleprintprograms;

public class GlobalVariable9 {
	static int rollNum=456;
	static boolean result;
	
	double payment=45000.56;
	char grade;
	public static void main(String[] args) {
		 System.out.println("rollNum: "+GlobalVariable9.rollNum);
	     System.out.println("rollNum: "+rollNum);
         
	     System.out.println("result: "+GlobalVariable9.result);
	     System.out.println("result: "+result);
	     GlobalVariable9 F1= new GlobalVariable9();
	     System.out.println("payment:"+F1.payment);
	     System.out.println("grade:"+F1.grade);
	     
	     rollNum=324;
	     result=true;
	     F1.payment=54220.56;
	     F1.grade='S';
	     System.out.println("rollNum: "+GlobalVariable9.rollNum);
	     System.out.println("rollNum: "+rollNum);
	     
	     System.out.println("result: "+GlobalVariable9.result);
	     System.out.println("result: "+result);
	     
	     System.out.println("payment:"+F1.payment);
	     System.out.println("grade:"+F1.grade);
	}     

}
