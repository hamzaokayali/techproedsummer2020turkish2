package day10stringmethods;

public class StringMethods01 {

	public static void main(String[] args) {
		
		//charAt() methodu index ine g�re harfleri al�r
		

		String s = "Java ah Java!";
		
		System.out.println(s.charAt(5));//a
		System.out.println(s.charAt(8));//j
		System.out.println(s.charAt(12));//!
		
		// contains();  string i�inde varm� yok mu kontrol i�in kullan�l�r
		String t = "Hayat ah hayat!";
		System.out.println(t.contains("y"));//true
		System.out.println(t.contains("w"));//false
		System.out.println(t.contains("Ayat"));//false case 
		
		
		String u = "G�zel G�nler!";
		
		// endsWith() bir string in hangi karakter yada karakterler ile bitti�ini kontrol eder
		//geriye boolean de�er g�nderir
		System.out.println(u.endsWith("!")); //true
		System.out.println(u.endsWith("ler!")); //true
		System.out.println(u.endsWith("x")); //false
		
		String v = "M�kemmel g�nler!";
		System.out.println(v.length());
		
		String y = "Bir �eyler oldu";
		System.out.println(y.toUpperCase());
		
		String z = "Baz� �eyler oldu";
		System.out.println(z.toLowerCase());
		
		//replace(); methodu stringteki eski karakter ile yeni karakter de�i�tirmesini yapar   
		String a = "evde kal!!";
		System.out.println(a.replace("e" , "a"));
		System.out.println(a.replace("evde", "d�kkanda"));
		System.out.println(a.replace("e", ""));
		
	String b = "Tam say�lar� siliyor 1257 ?!@$_";
	//\\d rakamlar� y�ld�z ile de�i�tirir
	System.out.println(b.replaceAll("\\d", "*"));
	//\\D Rakam d���ndaki her�eyi y�ld�s ile de�i�tirir	
	System.out.println(b.replaceAll( "\\D" , "*"));
	//\\S bo�luk d���ndaki her�eyi de�i�tirir
	System.out.println(b.replaceAll("\\s", "*"));
	//\\w ifadesi harfler say�lar ve _ leri de�i�tirir
	System.out.println(b.replaceAll("\\w", "*"));
	//\\W ifadesi ise tam tersi
	System.out.println(b.replaceAll("\\W", "*"));
	
		
		
		
		
		
		

	}

}
