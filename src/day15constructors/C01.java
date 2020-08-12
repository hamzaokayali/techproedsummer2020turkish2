package day15constructors;

public class C01 {
	/*
	 * Constructor lar main methodun dýþýnda classýn içinde oluþturulur.
	 * 
	 * Constructorun ismi class ismi ile ayný olmalýdýr.
	 * 
	 * Method ile condtructor farký a) method ismi class ismi ile farklý
	 * 								  olabilir. Ama constructor ayný olmak zorundadýr.
	 * 								b) Methodlarda return type olmak zorundadýr ama constructor larda return  
	 * 								  olmak zorunda deðildir. Return type eklenirse java onu method olarak görür
	 * 
	 * Bir class ta birden fazla constructor olabilir Ama constuructor parametreleri farklý olmalýdýr
	 * Overleoding kurallarý uygulanarak yapýlabilir.
	 * 
	 * 
	 * */
	C01(){
		System.out.println("Parametresiz");
		
	}
	C01(int a){
		System.out.println("Integer parametreli");
		
	}
	C01(String s){
		System.out.println("String parametreli");
		
	}
	C01(String d, int i){
		System.out.println("Ýki parametreli");
		
	}

	public static void main(String[] args) {
		// Obje üretmek için 
		
		C01 o1 = new C01();
		C01 o2 = new C01(5);
		C01 o3 = new C01("");
		C01 o4 = new C01("",4);
		
		
		
	}
	
	public void toplama () {
		System.out.println("Toplmam");
		
	}

}
