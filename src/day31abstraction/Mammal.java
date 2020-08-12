package day31abstraction;

public abstract class Mammal extends Animal {
	
	/*	
	 * 	Burada mammal, animal classý ve asi() ile drink() ovirride 
	 * etmek zorunda kalmadý Cünkü mammal classýn da abstract olduðu için 
	 * 
	 * 
	 * 
	 * */

	public abstract void feed();
	
	public void move () {
		System.out.println("hareket ederler");
	}
	
}
