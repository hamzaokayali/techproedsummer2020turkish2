package day04scanner;

public class TypeCasting01 {

	public static void main(String[] args) {
		byte b1 = 13;
		int i1 = b1;
		int i2 = 170;
		
		
		short s1 = 2300;
		float f1 = s1;
		
		byte b2 = (byte)i2;
		
		System.out.println(i1);
		 double d1 = 536.5654;
		 float f2 = (float)d1;
		 System.out.println(f1+b2);
		 
		System.out.println(""+f2+ " "+ i2);	

	}

}
