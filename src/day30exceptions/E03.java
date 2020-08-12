package day30exceptions;

public class E03 {

	/*/ Integer wrapper class �n�n i�indeki parseInt() methodu 
		Stringleri say�ya �evirmek i�in kullan�l�r
	
	*	E�er bir say� olmayan bir stringi ParseInt() metodu ile say�ya cevirmeye 
	*	�al���rsak NumberFormatException hatas� al�r�z 
	*
	*
	*/	
	public static void main(String[] args) {
		String s = "12345";
		String t = "asdf";
		
		int i = Integer.parseInt(s);
		//int i1 = Integer.parseInt(t);  //NumberFormatException
		System.out.println(i+20);
		
	}

}
