package day27inheritance;

public class Dog extends Mammal  {
	
	public boolean loyal=true;
	public Dog() {
		System.out.println("dog");
	}

	public static void main(String[] args) {
		Dog d2 = new Dog();
		System.out.println("sad�k m� "+d2.loyal);
		System.out.println("do�um? " +d2.dogum);
		System.out.println("ya� "+ d2.age);
		System.out.println();


		

	}
	public void smell() {
		System.out.println("�yi Koku Al�rlar");
	}
	public void bark() {
		System.out.println("Havlarlar");
	}



}
