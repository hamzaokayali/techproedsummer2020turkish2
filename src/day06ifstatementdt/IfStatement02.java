package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement02 {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
		
		System.out.println("Bir G�n Giriniz");
		String s=scan.next();
		
		
		if (s.equals("cuma")) 
			{System.out.println("M�sl�manlar ��in Kutsal g�n");}		
		
		if (s.equals("cumartesi")) 
			{System.out.println("Yahudiler ��in Kutsal g�n");}
	
		if (s.equals("pazar")) 
			{System.out.println("H�ristiyanlar ��in Kutsal g�n");}
		
		
scan.close();
	}

}


