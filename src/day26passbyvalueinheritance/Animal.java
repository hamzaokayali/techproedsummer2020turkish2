package day26passbyvalueinheritance;

public class Animal {

	public static void main(String[] args) {
		Animal oA = new Animal();
		
		oA.drink();
		oA.eat();

	}
	public  void eat() {
		System.out.println("Yemek yerler");
	}
	public  void drink() {
		System.out.println("Su içerler");
	}
}
