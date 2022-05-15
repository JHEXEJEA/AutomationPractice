package Ifcondition;

public class Ifcondition3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int marks=50;
        if(marks<50) {
        	System.out.println("fail");
        }
        else if(marks>=50&&marks<60) {
        	System.out.println("D grade");
        }
        else if(marks>=60 && marks<70) {
        	System.out.println("C grade");
        }
        else if (marks>=70 && marks<80) {
        	System.out.println("B grade");
        }
	}
	

}
