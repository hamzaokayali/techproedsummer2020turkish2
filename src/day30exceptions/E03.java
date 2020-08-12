package day30exceptions;

public class E03 {

	/*/ Integer wrapper class ýnýn içindeki parseInt() methodu 
		Stringleri sayýya çevirmek için kullanýlýr
	
	*	Eðer bir sayý olmayan bir stringi ParseInt() metodu ile sayýya cevirmeye 
	*	çalýþýrsak NumberFormatException hatasý alýrýz 
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
