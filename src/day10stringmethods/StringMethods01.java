package day10stringmethods;

public class StringMethods01 {

	public static void main(String[] args) {
		
		//charAt() methodu index ine göre harfleri alýr
		

		String s = "Java ah Java!";
		
		System.out.println(s.charAt(5));//a
		System.out.println(s.charAt(8));//j
		System.out.println(s.charAt(12));//!
		
		// contains();  string içinde varmý yok mu kontrol için kullanýlýr
		String t = "Hayat ah hayat!";
		System.out.println(t.contains("y"));//true
		System.out.println(t.contains("w"));//false
		System.out.println(t.contains("Ayat"));//false case 
		
		
		String u = "Güzel Günler!";
		
		// endsWith() bir string in hangi karakter yada karakterler ile bittiðini kontrol eder
		//geriye boolean deðer gönderir
		System.out.println(u.endsWith("!")); //true
		System.out.println(u.endsWith("ler!")); //true
		System.out.println(u.endsWith("x")); //false
		
		String v = "Mükemmel günler!";
		System.out.println(v.length());
		
		String y = "Bir þeyler oldu";
		System.out.println(y.toUpperCase());
		
		String z = "Bazý þeyler oldu";
		System.out.println(z.toLowerCase());
		
		//replace(); methodu stringteki eski karakter ile yeni karakter deðiþtirmesini yapar   
		String a = "evde kal!!";
		System.out.println(a.replace("e" , "a"));
		System.out.println(a.replace("evde", "dükkanda"));
		System.out.println(a.replace("e", ""));
		
	String b = "Tam sayýlarý siliyor 1257 ?!@$_";
	//\\d rakamlarý yýldýz ile deðiþtirir
	System.out.println(b.replaceAll("\\d", "*"));
	//\\D Rakam dýþýndaki herþeyi yýldýs ile deðiþtirir	
	System.out.println(b.replaceAll( "\\D" , "*"));
	//\\S boþluk dýþýndaki herþeyi deðiþtirir
	System.out.println(b.replaceAll("\\s", "*"));
	//\\w ifadesi harfler sayýlar ve _ leri deðiþtirir
	System.out.println(b.replaceAll("\\w", "*"));
	//\\W ifadesi ise tam tersi
	System.out.println(b.replaceAll("\\W", "*"));
	
		
		
		
		
		
		

	}

}
