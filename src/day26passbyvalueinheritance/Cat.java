package day26passbyvalueinheritance;

public class Cat extends Mammal{

	public static void main(String[] args) {
		Cat oC = new Cat();
		
		oC.clean();
		oC.drink();
		oC.eat();
		oC.feed();
		oC.meaw();

	}
	public  void meaw() {
		System.out.println("Miyavlarlar");
	}
	public  void clean() {
		System.out.println("Temizlenirler");
	}

}
