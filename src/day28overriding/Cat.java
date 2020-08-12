package day28overriding;

public class Cat extends Animal {

	public static void main(String[] args) {
		
		
		Cat c1 = new Cat();
		c1.sound();
		c1.numOfFoot();
		
		
		
		
		
	}@Override 
	public void sound() {
		System.out.println("Miyavlarlar");
	}
	@Override
	public void numOfFoot() {
		System.out.println("4 ayaklýdýrlar");
	}
	@Override
	public Cat myMethod() {
		Cat c2 = new Cat();
		return null;
	}
	

}
