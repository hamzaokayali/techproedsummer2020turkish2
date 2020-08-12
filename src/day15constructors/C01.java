package day15constructors;

public class C01 {
	/*
	 * Constructor lar main methodun d���nda class�n i�inde olu�turulur.
	 * 
	 * Constructorun ismi class ismi ile ayn� olmal�d�r.
	 * 
	 * Method ile condtructor fark� a) method ismi class ismi ile farkl�
	 * 								  olabilir. Ama constructor ayn� olmak zorundad�r.
	 * 								b) Methodlarda return type olmak zorundad�r ama constructor larda return  
	 * 								  olmak zorunda de�ildir. Return type eklenirse java onu method olarak g�r�r
	 * 
	 * Bir class ta birden fazla constructor olabilir Ama constuructor parametreleri farkl� olmal�d�r
	 * Overleoding kurallar� uygulanarak yap�labilir.
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
		System.out.println("�ki parametreli");
		
	}

	public static void main(String[] args) {
		// Obje �retmek i�in 
		
		C01 o1 = new C01();
		C01 o2 = new C01(5);
		C01 o3 = new C01("");
		C01 o4 = new C01("",4);
		
		
		
	}
	
	public void toplama () {
		System.out.println("Toplmam");
		
	}

}
