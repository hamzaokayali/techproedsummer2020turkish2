package day32interface;

public interface Klima {
	
	
	void isitma ();
	
	void antibakteri();
		
	int i=15;
	
	void fiyat();
	
	default void so�utma() {
		System.out.println("Iy� So�utur");
	}
	

}
