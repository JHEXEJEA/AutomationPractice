package Ifcondition;

public class IfCondition1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=55;//check if no. is divisible 2 or not
		if( number%2==0){
		System.out.println("even number");
		}else {
  System.out.println(" odd number");
		}
		IfCondition1.checkEvenOddNumber(700);
		               checkEvenOddNumber(711);
}
	 static void checkEvenOddNumber(int num) {
		 if ( num%2==0) {
	System.out.println("given number is even number:"+num);
		 }else {
			 System.out.println("given number is odd:"+num);
		 }
	 }
	 static boolean isNumberEven(int num) {
		 if(num%2==0) {
			 return true;
			 }else {
				 return false;
		 }
	 }
}