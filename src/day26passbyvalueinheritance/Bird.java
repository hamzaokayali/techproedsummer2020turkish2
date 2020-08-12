package day26passbyvalueinheritance;

public class Bird extends Animal {

	public static void main(String[] args) {
		Bird oB = new Bird();
		
		oB.drink();
		oB.eat();
		oB.fly();

	}
	public  void fly() {
		System.out.println("Uçarlar");
	}
	

}
