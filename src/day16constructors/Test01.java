package day16constructors;


public class Test01 {

	static int i =1;
	
	public static void main(String[] args) {
		
		for ( i=1;i<10;++i) {
			//i+=2;
			System.out.println(i+ " " );
			
		}
		System.out.println("==>"+i);
		for (int i=1;i<10;i++) {
			i+=2;
			System.out.println(i+ " " );
			new Test01();
		}

	}

	public class Test02 {
		
	}
}


