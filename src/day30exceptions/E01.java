package day30exceptions;

public class E01 {
	

	/*
	 * 1) kod yazarken k�rm�z� alt cizgi almad���n�z hrlde kodu �al��t�rd���n�zda al�rsan�z
	 *    buna run time exception denir.
	 *    a) arithmethicexception bir run time exceptiondur.Bir say�y� 0 a b�lmek bu hatay� verir
	 *    b) null atanm�� bir stringi length ini almak isterseniz 
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
			System.out.println("bir say�y� s�f�ra b�lemezsiniz");
		}
		
		System.out.println(s1.length());//0
		System.out.println(s2.length());//NullPointerException

	}

}
