package day27inheritance;

public class Dog extends Mammal  {
	
	public boolean loyal=true;
	public Dog() {
		System.out.println("dog");
	}

	public static void main(String[] args) {
		Dog d2 = new Dog();
		System.out.println("sadýk mý "+d2.loyal);
		System.out.println("doðum? " +d2.dogum);
		System.out.println("yaþ "+ d2.age);
		System.out.println();


		

	}
	public void smell() {
		System.out.println("Ýyi Koku Alýrlar");
	}
	public void bark() {
		System.out.println("Havlarlar");
	}



}
