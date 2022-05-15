package Inheritance; 
   
class fruitA{
	int fruitAge;
	fruitA() {
		System.out.println("fruitA class cons....");
		fruitAge=7;
	}
	public void taste() {
		System.out.println("Fruit are sweet");
	}
}
  class mango extends fruitA{
	  int fruitAge;
	  mango(){
		  System.out.println("mango class constr");
		  fruitAge=5;
	  }
	  public void taste() {
		  System.out.println("mangio are tart in taste");
		  
	  }
	  public void shape() {
		  System.out.println("mango is rount");
	  }
  }
public class Inheritance1 {

	public static void main(String[] args) {
		mango m1=new mango();
		m1.shape();
		m1.taste();
		System.out.println(m1.fruitAge);
		fruitA f1=new fruitA();
		f1.taste();
		System.out.println(f1.fruitAge);
		// TODO Auto-generated method stub

	}

}
