package simpleprintprograms;

public class Method8 {

	public static void main(String[] args) {
		
		System.out.println(" Interest;"+Method8.getInterest( 25000,6.5,60) );
		  Method8.getInterest(24000,6.7,90);
		  System.out.println(" Interest;"+Method8.getInterest1( 25000,6.5,60) ); 
		  Method8.getInterest2( 36000,6.0,70 );
		
	}

	public static  double getInterest(int p,double r,int t) {
		return (p*r*t);
		
	}
	public static  double getInterest1(int p,double r,int t) {
		double res=(p*r*t)/100;
		return res;
	} // OR
	public static void  getInterest2(int p,double r,int t) {
		double res=(p*r*t)/100;
		
		System.out.println(" Inteest is:"+res);
	}	
	
}
