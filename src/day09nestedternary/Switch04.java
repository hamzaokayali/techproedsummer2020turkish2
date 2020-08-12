package day09nestedternary;

import java.util.Scanner;

public class Switch04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir ay numarasýný Giriniz");
				
				String a = scan.next();
	
			switch (a) {
				case "mart": 
				case "nisan": 	
				case "mayýs":System.out.println("illbahar");break;
				case "haziran": 
				case "temmuz": 	
				case "aðustos":System.out.println("yaz"); break;
				case "eylül": 
				case "ekim": 	
				case "kasým":System.out.println("sonbahar"); break;
				case "aralýk": 
				case "ocak": 	
				case "þubat":System.out.println("kýþ"); break;
				default : System.out.println("Geçerli bir ay giriniz");
	scan.close();
			}

	}

}
