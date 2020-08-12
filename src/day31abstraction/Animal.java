package day31abstraction;

public abstract  class Animal {
	/*
	 * 1) Abstract soyut demektir z�t anlaml�s� concrete dir ve somut demektir
	 * 2) Abstract class lardan object �retilemez c�nk� soyuttur.
	 * 3) Abstract class olu�turarak child classlar� baz� �eyleri yapmaya mecbur b�rak�r�z
	 * 4) Abstract class i�erisinde olu�turdu�umuz abstract methodlar child classlar taraf�ndan uygulanmak zorundad�r
	 * 	  concrete class i�inde abstract method yazamay�z.
	 * 
	 * */
	public abstract void asi() ;
	
	public abstract void drink() ;
	
	public void yemek () {
		System.out.println("yemek yerler");
	}
	
	
		
	
	

}
