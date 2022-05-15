package Ifcondition;

public class Ifcondition5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int year=2021;
        
        if((year % 4==0)&&( year % 100==0)||( year% 400==0)){
        	
        
        	System.out.println(" LEAP YEAR");
        }else {
        	System.out.println(" COMMON YEAR OR NON LEAP YEAR");
        }
        	
        	System.out.println(" given year is leap year or not:" +checkleapyear(2020));
        	System.out.println("given year is leap year or not:" +checkleapyear(2010) );
	}
        	
        	
        	static boolean checkleapyear(int year) {
        		if (((year %4==0)&& (year% 100!=0)||(year%400==0))) {
        			System.out.println("LEAP YEAR");
        			  return true;
        		}else {
        			System.out.println(" COMMON YEAR OR NON COMMON YEAR");
        		 return false;
        		}
        	}
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
	}


