package simpleprintprograms;

public class GlobalVariable2 {
	static double empID=123;

	public static void main(String[] args) {
		int empID=123,age=35;
		System.out.println("standard way to access SGV,empID:" +GlobalVariable2. empID); 
        System.out.println("standard way to access LV,empID:" +empID);
        System.out.println("standard way to access LV,age:" +age);
	}   

}
