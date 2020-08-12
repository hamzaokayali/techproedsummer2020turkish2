package day17staticblock;

public class Sb02 {
 
	static int x = 10;
	
	public static void main(String[] args) {
		
		Sb02 o = new Sb02();
		System.out.println(o.x);
		
	}

	static {
		 x = 50;
		System.out.print(x + " ");
	}
}
