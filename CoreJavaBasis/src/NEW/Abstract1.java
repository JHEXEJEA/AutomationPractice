package NEW;
abstract class Animal {
	public abstract void animalsound();
	public void sleep() {
		System.out.println("zzz");
	}
}
  class Pig extends Animal{
	  public void animalsound() {
		  System.out.println(" wee,wee");
		  
	  }
  }
  class Dog8 extends Animal{
	  
  
  public void animalsound() {
	  System.out.println("bow bow");
  }
	  
  }
public class Abstract1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Pig mypig= new Pig();
       mypig.sleep();
       Dog8 D1=new Dog8();
       D1.animalsound();
       D1.sleep();
	}

}
