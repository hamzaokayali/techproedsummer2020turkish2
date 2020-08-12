package day23daytime;

import java.util.ArrayList;
import java.util.List;

public class Soru01 {

	public static void main(String[] args) {
		
		List<String> l1 = new ArrayList<>();
		l1.add("A");
		l1.add("B");
		l1.add("C");
		l1.add("D");
		
		List<String> l2 = new ArrayList<>();
		l2.add("E");
		l2.add("F");
		l2.add("G");
		l2.add("A");
		boolean kon = false ;
		for (String w : l1) {
			for (String  a: l2) {
				if (w.equals(a)) {
					kon = true;
					System.out.println(w);
			}}
			
		}
		if (!kon)
			System.out.println("ortak eleman yok");
		}

}
