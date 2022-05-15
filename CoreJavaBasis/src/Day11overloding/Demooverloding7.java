package Day11overloding;


	
	
	class Demooverloding7 {
		static int add(int a,int b) {
		return a + b;
	}
   static int add(int a,int b,int c) {
	   return a+b+c;
   }
   static void call() {
	   System.out.println("I am call() of Demooverloding7 ");
   }
   
	   
		  
   
   
	public class Day11overloding {
		 void call() {
		System.out.println(" I am call()");
			
		// TODO Auto-generated method s}

		}
		public  void main(String[] args) {
			System.out.println("add:"+add(11,11,11));
			Demooverloding7.call();
		}
			
	}	
		
}