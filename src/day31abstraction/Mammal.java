package day31abstraction;

public abstract class Mammal extends Animal {
	
	/*	
	 * 	Burada mammal, animal class� ve asi() ile drink() ovirride 
	 * etmek zorunda kalmad� C�nk� mammal class�n da abstract oldu�u i�in 
	 * 
	 * 
	 * 
	 * */

	public abstract void feed();
	
	public void move () {
		System.out.println("hareket ederler");
	}
	
}
