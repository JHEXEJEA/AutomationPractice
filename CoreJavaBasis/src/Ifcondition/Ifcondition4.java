package Ifcondition;

public class Ifcondition4 {

	public static void main(String[] args) {
		int num1 =45, num2=30;
		if(!(num1==num2)) {
			System.out.println("number1 is greter than number2");
			
		}else {
			System.out.println("number1 is smaller than number2");
		}
		if ( num1> num2) {
			System.out.println("number1 is greter than number2");
		}else  {
			System.out.println("number1 is smaller than number2");
		}
		if ( num1>=num2) {
			System.out.println(" number1 is either equals to number2 or greater than number2");
			
		}else {
			System.out.println(" number1 is  smaller than number2");
			
			
		}
		if ( num1==num2|| num1>num2) {
			System.out.println(" number1 is either equals to number2 or greater than number2");
		} else {
			System.out.println(" number1 is  smaller than number2");
			
		}

	}

}
