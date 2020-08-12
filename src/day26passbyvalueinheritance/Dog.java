package day26passbyvalueinheritance;

public class Dog extends Mammal {

	public static void main(String[] args) {

		Dog oD = new Dog();
		oD.bark();
		oD.drink();
		oD.eat();
		oD.feed();
		oD.smell();
	}
	public  void bark() {
		System.out.println("Havlarlar");
	}
	public  void smell() {
		System.out.println("Ýyi koku alýrlar");
	}

}
