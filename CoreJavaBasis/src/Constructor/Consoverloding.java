package Constructor;

public class Consoverloding {
	
	 Consoverloding(){
		 System.out.println("ZERO parameterized Constructor");
		 System.out.println(" having no parameter");
	 }
	 Consoverloding(int a){
		 System.out.println(" parameterized Constructor");
		 System.out.println(" having int parameter"+a);
 }
	 Consoverloding(double b ){
		 System.out.println(" parameterized Constructor");
		 System.out.println(" having double parameter"+b);
	 
	 }
	 Consoverloding(int a,double b){
		 System.out.println(" parameterized Constructor");
		 System.out.println(" having int,double parameter"+a);
	 }
	public static void main(String[] args) {
		Consoverloding Pc1=new Consoverloding();
		Consoverloding Pc2=new Consoverloding( 12);
		Consoverloding Pc3=new Consoverloding( 67.9);
		Consoverloding Pc4=new Consoverloding( 23,43.0d);
		// TODO Auto-generated method stub

	}

}
