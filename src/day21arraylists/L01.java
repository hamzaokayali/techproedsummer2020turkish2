package day21arraylists;

import java.util.ArrayList;
import java.util.List;

public class L01 {

	public static void main(String[] args) {
			
			
		ArrayList <String> sl = new ArrayList<String>();
		
		ArrayList <String> sl1 = new ArrayList<>();
		
		List <String> sl3 = new ArrayList<>();
		
		sl3.add("A");
		
		System.out.println(sl3);
		
		sl3.add("B");
		sl3.add("C");
		
		System.out.println(sl3);
		
		sl3.add(1, "X");
		
		System.out.println(sl3);
		
		sl3.add(0, "Mustafa");
		System.out.println(sl3);
		
		System.out.println(sl3.size());//list büyüklüðünü verir
		
		System.out.println(sl3.isEmpty());//list boþu dolumu bakar boolean geri döndürür
		
		sl3.remove(0);
		System.out.println(sl3);
		sl3.remove("X");
		System.out.println(sl3);
		System.out.println(sl3.add("B"));
		System.out.println(sl3);
		System.out.println(sl3.remove("G"));
		System.out.println(sl3);
		System.out.println(sl3.remove(0));
		System.out.println(sl3);
	}

}
