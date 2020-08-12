package day21arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L02 {

	public static void main(String[] args) {
		List <String>  sl = new ArrayList<>();
		sl.add("Ali");
		sl.add("Kemal");
		sl.add("Ayþe");
		//Eleman deðiþtirme
		System.out.println(sl);
		sl.set(0,"Aliye");
		System.out.println(sl);

		//bie elemanýn varlýðýný kontrol etmek
		
		System.out.println(sl.contains("Kemal"));
		System.out.println(sl.contains("Ali"));
		System.out.println(sl.contains(""));
		System.out.println(sl);
		Collections.sort(sl);
		System.out.println(sl);
		Collections.reverse(sl);
		System.out.println(sl);
		sl.clear();
		System.out.println(sl);
		
		//list ler asla primitive ler ile çalýþmazlar 
		List <Integer> il1 =new ArrayList<>();
		il1.add(12);
		il1.add(13);
		il1.add(14);
		List <Integer> il2 =new ArrayList<>();
		il2.add(12);
		il2.add(13);
		il2.add(14);
		
		
		System.out.println(il1.equals(il2));
		il2.add(15);
		System.out.println(il1.equals(il2));
		
		
		
		
	}

}
