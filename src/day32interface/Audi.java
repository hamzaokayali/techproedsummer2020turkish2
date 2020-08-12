package day32interface;

public class Audi implements Car ,Klima {

	public static void main(String[] args) {
	
	}

	@Override
	public void motor() {
		System.out.println("2.8T Turbo Benzinli");
		
	}

	@Override
	public void direksiyon() {
		System.out.println("Gerçek deri");
		
	}

	@Override
	public void cam() {
		System.out.println("24 inch celik jant");
		
	}

	@Override
	public void isitma() {
		System.out.println("Akýllý Isýtma");
		
	}

	@Override
	public void antibakteri() {
		System.out.println("100% bakteri koruma");
		
	}

	@Override
	public void fiyat() {
		// TODO Auto-generated method stub
		
	}

}
