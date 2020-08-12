package day28overriding;

public class Dog extends Animal {

	public static void main(String[] args) {
		
		int c = 0;
		Dog d1 = new Dog();
		d1.sound();
		System.out.println(++c);

	}
	
	public void sound() {
		System.out.println("Havlarlar");
	}
	@Override
	public void numOfFoot() {
		System.out.println("4 ayaklýdýr");
	}

}
