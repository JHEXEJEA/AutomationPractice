package Ifcondition;

public class Assignment6 {//STAR
	 public static void main(String[] arg ) {
		 revprintStar();
		 printstar();
	 }
	 static void printstar() {
		 for( int i=0;i<5;i++) {
			 for( int j=0;j<=i;j++) {
				 System.out.print(j+" ");
			 }
			 System.out.println();
		 }
		 
	 }
	 static void revprintStar() {
		 for(int i=5;i>0;i--) {
			 for( int j=0;j<i;j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	 }
	 
}