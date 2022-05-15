package simpleprintprograms;

public class GlobleVariable3{
	static int empID=123;

	public static void main(String[] args) {
		int age=30;empID=567;
		System.out.println("Local Variable,age:"+age);//30
        System.out.println("Direct way to access SGV,empID:"+empID);//567
        System.out.println("Standard way to access,empID:" +GlobleVariable3.empID);//123
        int empID=456;
        System.out.println("Upadated Direct way to access SGV,empID:"+empID);//456
        System.out.println("Standard way to access,empID:" +GlobleVariable3.empID);//123
        		
        		
	}   

}
