package day23daytime;

public class V01 {

	public static void main(String[] args) {
		
		add(3,5);
		add(3,5,7);
		add(65,54,87,98,645,31,54,0);
		product();
		product(2,5,6);
		

	}
	public static void add(int s1 , int s2) {
		System.out.println(s1+s2);
	}
	
	public static void add(int s1 , int s2 , int s3) {
		System.out.println(s1+s2+s3);
	}
	
	
	
	public static void add(int... m ) {
		int sum = 0;
		for(int w : m) {
			sum+=w;
		}
		System.out.println(sum);
	}
	public static void product(int ... p) {//varags
		int product = 1;
		for(int w : p) {
			product*=w;
		}
		System.out.println(product);
	}
	
	
	
}
