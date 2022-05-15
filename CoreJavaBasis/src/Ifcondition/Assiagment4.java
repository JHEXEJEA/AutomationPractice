package Ifcondition;

public class Assiagment4 {//reverse number

	public static void main(String[] args) {
		int num=123,rev=0,rem=0;
		while(num!=0) {
			rem=num%10;//123%10=3------>12%10=2------->1%10=3
			rev=num*10+rem;
			num=num/10;
		}
		// TODO Auto-generated method stub
  System.out.println("Reverse number:"+rev);
  System.out.println("Reverse number using method:"+getReverseNumber(12345));
  System.out.println("getPalindromeNumber(121)");
  System.out.println("getPalindromeNumber(123)");
  
	}
	public static boolean getPalindromeNumber(int num) {
		 System.out.println("Check palindrome for number:"+num);
		 int rev = 0,rem, temp=num;
		 while(num!=0) {
			 rem=num%10;
			 rev=rev*10+rem;
			 num=num/10;
		 }
		 if(temp==rev) {
			 return true;
		 }
		 return false;
	}
	public static int getReverseNumber(int num ) {
		int rev = 0,rem;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		return rev;
	}

}
