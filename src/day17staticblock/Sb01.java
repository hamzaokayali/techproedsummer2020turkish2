package day17staticblock;

public class Sb01 {
	
	
	static double pi =3.14;
	
	Sb01(){
		System.out.println("constructor");
	}
	
	static {
	 pi =3.14;
	 System.out.println("deneme");
	}

	public static void main(String[] args) {
		/*
		 * bu class dairenin cevre ve alanýný hesaplayan bir uygulama olsun 
		 * hesaplamalar için pi sayýsý hep kullnýlacaktýr. class üretilirken deðer atamasýný 
		 * yapmak faydalýdýr. Eðer class üretilirken bazý variable lara deðer atamasý yapýlmasýný 
		 * istersenizstatic block kullanmalýsýnýz 
		 * 
		 * 
		 * */
System.out.println("aaa");
Sb01 o = new Sb01();

	
		
	}

}
