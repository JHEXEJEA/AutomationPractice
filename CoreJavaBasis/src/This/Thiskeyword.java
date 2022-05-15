package This;

public class Thiskeyword {
	 int a;
     int b;
     Thiskeyword(int a,int b){
    	//this.a=a;
    	//this.b=b;
     }
     void display() {
    	 System.out.println("a="+a+" b="+b);
     }	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Thiskeyword object=new Thiskeyword(10,23);
            		object.display();
           System.out.println(object.a+""+object.b);
           Thiskeyword object2= new Thiskeyword(102,201);
           object.display();
           System.out.println(object2.a+""+object2.b);

         }
	

}
