package simpleprintprograms;

public class Method7 {

	public static void main(String[] args) {
		System.out.println("Result of addition1:"+getAdditionResult(230.36,45));
		System.out.println("Result of addition2:"+Method7.getAdditionResult(250.36,36));
		
		double sum=getAdditionResult(25,67);
		System.out.println("Result of addition3:"+sum);
		
		double finalResult=sum*100;
		System.out.println("opeation:"+finalResult);
		
		
	}
		 static double getAdditionResult(double num1,double num2) {
			System.out.println("Number1"+num1);
			System.out.println("Number2"+num2);
			double res=num1+num2;
			return res;

	}

}
