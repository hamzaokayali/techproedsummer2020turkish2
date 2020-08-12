package day11stringmethodsforloopdt;

public class StringMethods01 {

	public static void main(String[] args) {
 
		String a = "Hadi gidelim bu diyarlardan!";
		System.out.println(a.startsWith("H"));
		System.out.println(a.startsWith(""));
		System.out.println(a.startsWith("Hadi"));
		System.out.println(a.startsWith("g" , 5));
		

		System.out.println(a.indexOf("i"));
		System.out.println(a.indexOf(""));
		System.out.println(a.indexOf('a'));
		System.out.println(a.indexOf("x"));
		
		
		String b = "Java ah Java!";
		
		System.out.println(b.lastIndexOf("v"));
		
		String c = "Karakartal";
		System.out.println(c.substring(4));
		System.out.println(c.substring(1));
		System.out.println(c.substring(0, 3	));
		//System.out.println(c.substring(2, 1));
		
		String d = "  java   ";
		System.out.println(d.length());
		d.trim();
		System.out.println(d.trim());
		
	}

}
