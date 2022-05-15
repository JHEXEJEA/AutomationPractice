package Ifcondition;

public class Thisstatment1 {
	Thisstatment1(){
		 this(25.36);
		System.out.println("HELLO,ZERO");
	}
	Thisstatment1(double d){
		this(15);
		System.out.println("HELLOdouble"+d);
	}
	Thisstatment1(int x){
		System.out.println("HELLO int"+x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thisstatment1 a1=new Thisstatment1() ;
		
		Thisstatment1 a2=new Thisstatment1(10);
		Thisstatment1 a3=new Thisstatment1(10.23);
	}

}
