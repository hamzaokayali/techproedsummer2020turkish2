package day32interface;

public interface Klima {
	
	
	void isitma ();
	
	void antibakteri();
		
	int i=15;
	
	void fiyat();
	
	default void soðutma() {
		System.out.println("Iyý Soðutur");
	}
	

}
