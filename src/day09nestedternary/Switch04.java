package day09nestedternary;

import java.util.Scanner;

public class Switch04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir ay numaras�n� Giriniz");
				
				String a = scan.next();
	
			switch (a) {
				case "mart": 
				case "nisan": 	
				case "may�s":System.out.println("illbahar");break;
				case "haziran": 
				case "temmuz": 	
				case "a�ustos":System.out.println("yaz"); break;
				case "eyl�l": 
				case "ekim": 	
				case "kas�m":System.out.println("sonbahar"); break;
				case "aral�k": 
				case "ocak": 	
				case "�ubat":System.out.println("k��"); break;
				default : System.out.println("Ge�erli bir ay giriniz");
	scan.close();
			}

	}

}
