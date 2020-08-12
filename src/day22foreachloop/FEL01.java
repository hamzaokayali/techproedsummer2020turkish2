package day22foreachloop;

import java.util.ArrayList;
import java.util.List;

public class FEL01 {

	public static void main(String[] args) {
		
		List<Integer> il = new ArrayList<>();
		il.add(21);
		il.add(22);
		il.add(23);
		il.add(24);
		il.add(25);
		il.add(26);
		
		// for-each loop = enhanced loop
		int sum=0;
		for (Integer w : il ) {
			sum+=w;
			System.out.print(w + " ");
			
		}
		System.out.println("Sayýlarýnýn Toplamý= "+sum);
		int a=1;
		for (Integer w : il) {
			if (w%2==1) {
				a*=w;
			}
		}
		System.out.println(a);
		
		for (Integer w : il) {
			if(w%2!=0) {
				System.out.println(w);
			}
		}
		int c =0;
		for (Integer w : il) {
			System.out.println(w);
			c++;
			if(c>2)
				break;
		}
		
		for (Integer w : il) {
			if (w%3==0) {
				System.out.print(w + " ");
			}
			
		}
		System.out.println();
		for (Integer w : il) {
			if (w%3!=0)
				continue;
			
			System.out.print(w + " " );
		}
		
		
	}

}
