package day26passbyvalueinheritance;

public class Mammal extends Animal{

	public static void main(String[] args) {
		
		
		Mammal oM = new Mammal();
		oM.drink();
		oM.eat();
		oM.feed();
		

	}
	public  void feed() {
		System.out.println("Yavrularýný beslerler");
	}

}
