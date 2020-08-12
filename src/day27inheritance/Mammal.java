package day27inheritance;

public class Mammal extends Animals  {
	public boolean dogum=true;
	public Mammal() {
		System.out.print("Mammal ");
	}

	public static void main(String[] args) {
	Dog d1 = new Dog();
	d1.bark();
	d1.drink();
	d1.eat();
	d1.feed();
	d1.smell();
	Bird b1 = new Bird();
	b1.drink();
	Mammal m1 = new Mammal();
	m1.feed();
	

	}
	public void feed() {
		System.out.println("Yavrularýný Beslerler");
	}
	public void eat() {
		System.out.println("Yavrularýný Beslerler");
	}

}
