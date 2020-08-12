package day27inheritance;

public class Bird extends Animals {
	
	public boolean kanat=true;
	public Bird() {
		System.out.println("bird");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void tweet() {
		System.out.println("Öterler");
	}
	public void nest() {
		System.out.println("Yuva Yaparlar");
	}
	public void fly() {
		System.out.println("Uçarlar");
	}



}
