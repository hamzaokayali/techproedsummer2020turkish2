package day28overriding;

public class Animal {

	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		a1.sound();
		a1.numOfFoot();
		
		

	}
	 void sound() {
		System.out.println("Ses ��kar�rlar");
	}
	public void numOfFoot() {
		System.out.println("Ayak say�lar� bellidir");
	}
	public Animal myMethod() {
		Animal a1 = new Animal();
		Dog d2 = new Dog();
		return null;
		
	}

}
