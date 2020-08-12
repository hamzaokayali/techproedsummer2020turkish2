package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement02 {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
		
		System.out.println("Bir Gün Giriniz");
		String s=scan.next();
		
		
		if (s.equals("cuma")) 
			{System.out.println("Müslümanlar Ýçin Kutsal gün");}		
		
		if (s.equals("cumartesi")) 
			{System.out.println("Yahudiler Ýçin Kutsal gün");}
	
		if (s.equals("pazar")) 
			{System.out.println("Hýristiyanlar Ýçin Kutsal gün");}
		
		
scan.close();
	}

}


