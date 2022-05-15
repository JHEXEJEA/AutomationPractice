package Inheritance;  
  
class Company{
	int empID;
	Company(){
		this( 23, 3000.0);
		System.out.println("company const.");
		empID=123;
		}
	Company( int age, double salary){
		//this();
	  
		System.out.println(" constructor with parameter");
	}
	public void maneger() {
		System.out.println(" zero paramerter");
	}
	public void maneger( int emp1) {
		
		System.out.println(" method with interger argumentcalled:");
		
	} 
	public void maneger( int emp1,double salary) {
		System.out.println(" method with two parameter");
		
	}
}
    class Employee extends Company{
	int empID=23;
	Employee(){
		this( 25,25000.0);
		System.out.println(" employee const");
		int empID=345;
		}
	Employee( int age,double salary){
		System.out.println(" empoyee with parameter");
	}
	public void days() {
		System.out.println( " no days");
	}
	public void days( int firstday , int secondday) {
		System.out.println( " with days");
	}
}
	
public class Inheritance2 {
	

	public  static void main(String[] args) {
	
		Employee E1=new Employee();
		System.out.println(" empID:"+E1.empID);
		    E1.days();
		    E1.days(1,2);
		Company C1= new Company();
		//System.out.println(" empID:"+this.empID);
		    C1.maneger();
		    C1.maneger(234,23000.0);
             
	}

}
