package day30exceptions;

public class E01 {
	

	/*
	 * 1) kod yazarken kýrmýzý alt cizgi almadýðýnýz hrlde kodu çalýþtýrdýðýnýzda alýrsanýz
	 *    buna run time exception denir.
	 *    a) arithmethicexception bir run time exceptiondur.Bir sayýyý 0 a bölmek bu hatayý verir
	 *    b) null atanmýþ bir stringi length ini almak isterseniz 
	 * 
	 * */

	public static void main(String[] args) {
	
		
		
		int a = 12 ;
		int b = 0 ;
		String s1 = "";
		String s2 = null;
		try {
		System.out.println(a/b);
		}catch(ArithmeticException e) {
			System.out.println("bir sayýyý sýfýra bölemezsiniz");
		}
		
		System.out.println(s1.length());//0
		System.out.println(s2.length());//NullPointerException

	}

}
