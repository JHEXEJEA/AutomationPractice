package simpleprintprograms;

public class GlobalandLocalVariable1 {
	static int roll =32;

	public static void main(String[] args) {
		int roll=65;
		System.out.println("roll:"+roll);
        System.out.println("roll:" +GlobalandLocalVariable1.roll);
	}

}
