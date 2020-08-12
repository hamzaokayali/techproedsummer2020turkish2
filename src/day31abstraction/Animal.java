package day31abstraction;

public abstract  class Animal {
	/*
	 * 1) Abstract soyut demektir zýt anlamlýsý concrete dir ve somut demektir
	 * 2) Abstract class lardan object üretilemez cünkü soyuttur.
	 * 3) Abstract class oluþturarak child classlarý bazý þeyleri yapmaya mecbur býrakýrýz
	 * 4) Abstract class içerisinde oluþturduðumuz abstract methodlar child classlar tarafýndan uygulanmak zorundadýr
	 * 	  concrete class içinde abstract method yazamayýz.
	 * 
	 * */
	public abstract void asi() ;
	
	public abstract void drink() ;
	
	public void yemek () {
		System.out.println("yemek yerler");
	}
	
	
		
	
	

}
