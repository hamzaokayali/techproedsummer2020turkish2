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
		 * bu class dairenin cevre ve alan�n� hesaplayan bir uygulama olsun 
		 * hesaplamalar i�in pi say�s� hep kulln�lacakt�r. class �retilirken de�er atamas�n� 
		 * yapmak faydal�d�r. E�er class �retilirken baz� variable lara de�er atamas� yap�lmas�n� 
		 * istersenizstatic block kullanmal�s�n�z 
		 * 
		 * 
		 * */
System.out.println("aaa");
Sb01 o = new Sb01();

	
		
	}

}
