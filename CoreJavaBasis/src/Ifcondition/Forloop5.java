package Ifcondition;

public class Forloop5 {//counter

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
      for(char c1 ='a';c1<='z';c1++) {

      
      System.out.println(c1 +"");
      }
      int counter =0;
      for (char c1 = 'a';c1<='z'; c1++) {
    	  if((c1=='a')||(c1=='e')||(c1=='i')||(c1=='0')||(c1=='u')) {
      }else {
    	  counter=++counter;
      }
	}
       System.out.println("consonent count between ato z:"+counter );
       int num=20,ct =0 ;
       System.out.println(num);
	   for(int i=1;i<=num;i++) { 
		if(i%2==0) {
			System.out.println(i);
			ct=++ct;
			
		}
	}

	}
}

	